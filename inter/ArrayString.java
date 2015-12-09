import java.util.*;

public class ArrayString{
	public static void main(String args[]){
		//isUniqueString();

		//cStyleReverse();

		removeDuplicates();

		//anagramSolver();

		//replaceSpace();

		setRowColZero();
	}

	static void isUniqueString(){
		//determine if string has all unique values
		//if i have two of the same characters can I return and break
		//if it's unique will i just return that string
		//i can't use an array then?
		String test1 = "abcdefg";
		String test2 = "abccdegg";

		boolean isUnique = true;

		for(int i = 0; i < test2.length(); i++){
			char checkLetter = test2.charAt(i);
			for(int j = i+1; j < test2.length()-1; j++){
				if(checkLetter == test2.charAt(j)){
					isUnique = false;
					break;
				}
					
			}
		}

		if(isUnique)
			System.out.println("Is unique");
		else 
			System.out.println("Not unique");
	}

	static void cStyleReverse(){
		char[] cArr = {'a', 'b', 'c', 'd', '*'};

		//swap d and a
		//swap c and b

		for(int i = cArr.length-2, j = 0; i>=0; i--){
			if(i == j)
				break;			
			if(i > j){
				char tmp = cArr[j];
				cArr[j] = cArr[i];
				cArr[i] = tmp;
				j++;
			}
		}

		for(int i = 0; i < cArr.length; i++){
			if(cArr[i] == '*')
				break;
			System.out.print(cArr[i] + " ");
		}
	}

	static void removeDuplicates(){
		String test1 = "abcde";
		String test2 = "abbcde";
		String test3 = "abbcddedeefd";


		//sort the string but then you lose the original word structure
		//get a char array

		char[] testArr = test3.toCharArray();
		StringBuffer sb = new StringBuffer();

		for(int i = 0; i < testArr.length; i++){
			char c = testArr[i];
			if(c != '*'){
				for(int j = i; j < testArr.length; j++){
					if(c == testArr[j])
						testArr[j] = '*';
				}

				sb.append("" + c);
			}
		}

		System.out.println(sb);
	}

	static void anagramSolver(){
		String test1 = "anagram";
		String _test1 = "nagaram";

		String test2 = "hello";
		String _test2 = "ola";

		boolean ana = false;

		//first check if they're equal length
		//then sort the string
		//String . compareTo will return 0

		if(test2.length() == _test2.length()){
			//now sort
			char[] t = test2.toCharArray();
			Arrays.sort(t);

			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < t.length; i++){
				sb.append("" + t[i]);
			}

			test2 = sb.toString();

			sb.setLength(0); //removes all the characters but keeps the buffer

			t = _test2.toCharArray();
			Arrays.sort(t);

			for(int i = 0; i < t.length; i++)
				sb.append("" + t[i]);

			_test2 = sb.toString();


			if(test2.compareToIgnoreCase(_test2) == 0){
				ana = true;
				System.out.println("Anagram :D");
			}
		}

		if(!ana)
			System.out.println("Not Anagram :(");
	}


	static void replaceSpace(){
		String test = "The rain in Spain Falls";

		for(int i = 0; i < test.length(); i++){
			if(test.charAt(i) == ' '){
				test = test.substring(0,i)+"%20"+test.substring(i+1,test.length());
			}
		}

		System.out.println(test);
	}

	static void setRowColZero(){
		int[][] mbyn = {{1,2,3,4}, {1,2,0,5}, {1,0,3,4}};

		//1234  1004
		//1205  0000
		//1034  0000
		int row = 3, col = 4;

		for(int i = 0; i< row; i++){
			for(int j = 0; j < col; j++){
				if(mbyn[i][j] == 0){
					for(int zr = 0; zr < row; zr++){
						mbyn[zr][j] = 0;
						for(int zc = 0; zc < col; zc++){
							mbyn[i][zc] = 0;
						}
					}
				}
			}
		}

		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(mbyn[i][j] + " ");
			}
			System.out.println("");
		}
	}
}