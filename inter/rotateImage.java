import java.util.*;

public class rotateImage{
	public static void main(String args[]){
		rotate90();
	}

	static void rotate90(){
		int[][] nbyn = {{1,2,3,4},{1,2,3,4},
				{1,2,3,4}, {1,2,3,4}};

		int len = 4;
		//it all starts with reversing the two sides
		//1 2 3 4		1111
		//1 2 3 4		2222
		//1 2 3 4		3333
		//1 2 3 4		4444
		
		//(i.length-1, 0) (i.length-2, 1) (i.length-3, 2) (i.length-3, 3)

		for(int i = 3; i>=0; i--){
			for(int j = 0; j < len; j++){
				int tmp = nbyn[i][j];
				nbyn[i][j] = 
			}
		}
	}
}