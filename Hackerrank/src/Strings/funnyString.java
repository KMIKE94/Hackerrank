package Strings;

import java.util.*;

public class funnyString {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		String[] str = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = in.next();
		}

		for (int i = 0; i < num; i++) {
			int distance = 0;
			int distance2 = 0;
			if (str[i].length() == 4) {
				distance = Math.abs(str[i].charAt(0) - str[i].charAt(1));
				distance2 = Math.abs(str[i].charAt(2) - str[i].charAt(3));
				if (distance == distance2) {
					System.out.println("Funny");
				} else {
					System.out.println("Not Funny");
				}
			} else if (str[i].length() % 2 == 0) {
				for (int j = 0; j < str[i].length() - 1; j++) {
					if (j > str[i].length() / 2) {
						distance += Math.abs(str[i].charAt(j)
								- str[i].charAt(j + 1));
					} else {
						distance2 += Math.abs(str[i].charAt(j)
								- str[i].charAt(j + 1));
					}
				}
				
				if (distance == distance2)
					System.out.println("Funny");
				else
					System.out.println("Not Funny");
			} else {
				distance = -1;
				if (distance == distance2)
					System.out.println("Funny");
				else
					System.out.println("Not Funny");
			}
		}
	}
}
