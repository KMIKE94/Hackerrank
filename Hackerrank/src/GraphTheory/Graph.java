package GraphTheory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Graph<T> {
	private HashMap<Vertex, TreeSet<Vertex>> adjList;
	private HashMap<T, Vertex> myVertices;
	private static final TreeSet<Vertex> EMPTY_SET = new TreeSet<Vertex>();
	private int numVertices;
	private int numEdges;

	public Graph() {
		adjList = new HashMap<Vertex, TreeSet<Vertex>>();
		myVertices = new HashMap<T, Vertex>();
		numVertices = numEdges = 0;
	}

	public Vertex addVertex(T value) {
		Vertex v;
		v = myVertices.get(value);
		if (v == null) {
			v = new Vertex(value);
			myVertices.put(value, v);
			adjList.put(v, new TreeSet<Vertex>());
			numVertices++;
		}
		return v;
	}

	public void addEdge(T from, T to) {
		Vertex v, w;
		if (isEdge(from, to))
			return;
		numEdges += 1;
		if ((v = getVertex(from)) == null) {
			v = this.addVertex(from);
		}
		if ((w = getVertex(to)) == null) {
			w = this.addVertex(to);
		}
		adjList.get(v).add(w);
		adjList.get(w).add(v);
	}

	public void removeEdge(T from, T to) {
		Vertex v, w;
		if (isEdge(from, to)) {
			if (isVertex(from) && isVertex(to)) {
				v = new Vertex(from);
				w = new Vertex(to);
				adjList.get(v).remove(w);
				adjList.get(w).remove(v);
			}else{
				return;
			}
		}else{
			return;
		}
	}

	public Vertex getVertex(T value) {
		return myVertices.get(value);
	}

	public boolean isVertex(T value) {
		return myVertices.containsKey(value);
	}

	public boolean isEdge(T from, T to) {
		if (!isVertex(from) || !isVertex(to))
			return false;
		return adjList.get(myVertices.get(from)).contains(myVertices.get(to));
	}

	public Iterator<Vertex> adjacentTo(T value) {
		if (!isVertex(value))
			return EMPTY_SET.iterator();
		return adjList.get(value).iterator();
	}

	public Iterator<Vertex> adjacentTo(Vertex v) {
		if (!adjList.containsKey(v))
			return EMPTY_SET.iterator();
		return adjList.get(v).iterator();
	}

	public Iterator<Vertex> getVertices() {
		return myVertices.values().iterator();
	}

	public int getNumVertices() {
		return numVertices;
	}

	public int getNumEdges() {
		return numEdges;
	}

	public String toString() {
		String s = "";
		for (Vertex v : myVertices.values()) {
			s += v.getVertexValue() + ": ";
			for (Vertex w : myVertices.values()) {
				s += w.getVertexValue() + ": ";
			}
			s += "\n";
		}
		return s;
	}

}
