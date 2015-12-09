package HilbertSpace;

import java.util.ArrayList;
import java.util.List;

public class ListList {
	public static void main(String args[]){
		List<List<Double>> array2D = new ArrayList<List<Double>>();
		
		//		 0		 1       2
		//	0:	5.0		7.0		3.0
		//	1:	6.0		8.0		4.0
		double[][] testValues = {{5.0,7.0,3.0},{6.0,8.0,4.0}};
		
		List<Double> row_1 = new ArrayList<Double>();
		row_1.add(testValues[0][0]);
		row_1.add(testValues[0][1]);
		row_1.add(testValues[0][2]);
		
		array2D.add(row_1);
		
		List<Double> row_2 = new ArrayList<Double>();
		//6
		row_2.add(testValues[1][0]);
		//6 8
		row_2.add(testValues[1][1]);
		//6 8 4
		row_2.add(testValues[1][2]);
		row_2.add(9.4);
		
		array2D.add(row_2);
		
		print2DArray(array2D);
		
	}
	
	static void print2DArray(List<List<Double>> array2D){
		int count = 0;
		for(List<Double> i : array2D){
			System.out.println("Row " + count + ":");
			for(double j : i){
				System.out.print("Column: " + j + " ");
			}
			System.out.println("");
			
			count++;
		}
	}
}
