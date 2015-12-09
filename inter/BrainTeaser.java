import java.util.*;
public class BrainTeaser{
	public static void main(String args[]){

	}

	public static void equationTrue(){
		// 3 1 3 6 = 8

		// 4 * 2 = 8
		// 16 / 2 = 8
		// 6 + 2 = 8
		// 4 + 4 = 8



	}

	public static  void insertionSortNumShifts(){
		int inner;
		for (int outer = 1; outer < array.length; outer++) {
			// outer is the next element to be sorted

			String temp = array[outer]; // back it up
			inner = outer;// inner used to track shifts
			while (inner > 0
					&& array[inner - 1].compareToIgnoreCase(temp) > 0
					|| array[inner - 1].compareToIgnoreCase(temp) == 0) {

				array[inner] = array[inner - 1];// swap
				inner--;
				if (inner == 0)
					break;

			} // shift them all right until one is smaller
			array[inner] = temp;
		}
	}

	public static void findWinner(){
		//first input is the number of testcases
		//second is the initial value

		//if n is not a power of two then reduc by the largest power of two less than N
		//if n is a power of two reduc counter by half N
		//if N == 1 that player has won

		//louise is first
		int check = 1 // 1 % 2 = 1
		//every turn update

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

			unsigned long long int n = in.nextInt();

			if((n & (n - 1)) == 0){
				//power
				n = n - (n/2);
				check++;
			}else{
				unsigned long long int largest_power_of_2 = n;
				while((largest_power_of_2 & (largest_power_of_2-1)) != 0){
					largest_power_of_2--;
				}

				n = n - largest_power_of_2;
				check++;
			}

			if(n == 1){
				if(check % 2 == 0){
					System.out.println("Richard");
				}else System.out.println("louise");
			}
	}
}