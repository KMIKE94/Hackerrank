package Strings;

import java.util.*;

public class Solution {
	static List<String> list;
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		int value = in.nextInt();
		
		list = new ArrayList<String>();
		for(int i = 0; i+value < word.length()+1; i++){
			list.add(word.substring(i, i+value));
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0) + "\n" + list.get(list.size()-1));
		
	}
}