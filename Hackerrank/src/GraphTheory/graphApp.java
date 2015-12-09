package GraphTheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class graphApp{
	public static void main(String args[]){
		//Graph g = new Graph()
		//g.addEdge(2,1)
		//g.addEdge(2,4)
		//g.addVertice(5)
		
		Graph g = new Graph();

//		g.addVertex("F");
//		g.addEdge("C", "A");
//		g.addEdge("A", "B");
//		g.addEdge("B", "C");
		Scanner in = new Scanner(System.in);
		
		int numVertices = in.nextInt();
		int numEdges = in.nextInt();
		
		for(int i = 0;i < numEdges; i++){
			g.addEdge(in.nextInt(), in.nextInt());
		}
		
		Iterator<Vertex> it;
//		while(it.hasNext()){
//			System.out.println(it.next().getVertexValue());
//		}
//		
//		System.out.println(g.getNumVertices() + " " + g.getNumEdges());
		
		Graph cur = g;
		
		printGraph(cur);
		
	}
	
	public static void printGraph(Graph g){
		Iterator<Vertex> it;
		Graph cur = g;
		int count = 0;
		boolean t = true;
		for(int i = 0; i < cur.getNumEdges(); i++){
			it = cur.adjacentTo(cur.getVertex(i+1));
			//remove it's edge and then calculate forest
			//it.next(), need the next value
			count++;
			while(it.hasNext()){
				if(t){
					System.out.print(count + ": " + it.next().getVertexValue() + " ");
					t = false;
				}
				else
					System.out.print(it.next().getVertexValue() + " ");
			}
			t = true;
			System.out.println("");
		}
	}
}