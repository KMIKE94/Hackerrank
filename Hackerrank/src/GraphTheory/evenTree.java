package GraphTheory;

import java.util.Iterator;
import java.util.Scanner;

public class evenTree {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int v = in.nextInt();
		int e = in.nextInt();
		
		Graph g = new Graph();
		for(int i = 0; i < v-1; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			g.addEdge(a, b);
		}
		
		Iterator<Vertex> it = g.getVertices();
		Iterator<Vertex> gIt;
		while(it.hasNext()){
			gIt = g.adjacentTo(it.next());
			while(gIt.hasNext()){
				System.out.print(gIt.next().getVertexValue() + " ");
			}
			System.out.println("");
		}
	}
}
