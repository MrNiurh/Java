package Java2;

import java.util.Scanner;

public class Page133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÒ»´®Êı×Ö:");
		String number = input.next();

		StringBuffer str = new StringBuffer(number);

		for (int i = str.length() - 3; i > 0; i = i - 3) {
			str.insert(i, ",");
		}

		System.out.println(str);
	}

}
