package bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * N is the varying amount of numbers to best inputted
 * Ki are the numbers themselve
 */
public class LonelyInteger {
	static int lonelyinteger(int[] a) {
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();

		int[] _a = new int[total];
		for (int i = 0; i < total; i++) {
			_a[i] = in.nextInt();
		}
		if (_a.length == 1) {
			System.out.println(_a[0]);
		} else {

			Arrays.sort(_a);
			int lonelyInt = 0;
			int i = 0;
			while (i < _a.length - 1) {
				if (_a[i] != _a[i + 1]) {
					lonelyInt = _a[i + 1];
					i++;
				} else if (_a[i] == _a[i + 1]) {
					int count = i;
					while (count < _a.length - 1 && _a[count] == _a[count + 1]) {
						count++;
					}
					lonelyInt = _a[count + 1];
					if (count != i) {
						i = count;
					} else
						i++;
				}
			}

			System.out.print(lonelyInt);
		}
	}
}
