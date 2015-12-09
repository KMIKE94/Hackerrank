import java.util.*;
public class BitManipulation{
	public static void main(String args[]){
		//Bit32();
		printBinary();
	}

	/**
	*You are given two 32-bit numbers, N and M, and two bit positions, 
	*i and j  Write a method to set all bits between i and j in N equal 
	*to M (e g , M becomes a substring of N located at i and starting at j) 
	*
	*/
	static void Bit32(){
		//give 1 to all bits up to j
		//give 1 to all bits up to i
		//or these two
		//then N and mask or M shifted to i spaces
		int N = 1024;
		int M = 21;
		int i = 2, j = 6;

		int allOne = ~0;
		System.out.println(allOne + "   " + Integer.toBinaryString(allOne));
		int left = allOne<<j+1;
		System.out.println(left + "   " + Integer.toBinaryString(left));
		int right = (1<<i)-1;
		System.out.println(right + "   " + Integer.toBinaryString(right));
		int mask = left | right;
		System.out.println(mask + "   " + Integer.toBinaryString(mask));

		//00000000000000000000010000000000 & 
		//11111111111111111111111110000011
		//00000000000000000000010001111100 |


		//00000000000000000000000000010101 << 2
		//00000000000000000000000001010100

		//00000000000000000000010001111100 |
		//00000000000000000000000001010100
		//00000000000000000000010001111100
		int result = (N&mask) | (M<<i);

		System.out.println(result + "   " + Integer.toBinaryString(result));
	}

	/**
	*Given a (decimal - e g  3 72) number that is passed in as a string, print 
	*the binary representation   If the number can not be represented accurately in binary, print “ERROR”
	*
	*/
	static void printBinary(){

		
	}

}