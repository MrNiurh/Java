package Java3;

import java.util.Arrays;

public class Page5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Tom", "Jack", "Merry", "Smith", "Sunny" };
		System.out.println("***����ǰ***");
		for (String n : names) {
			System.out.print(n + "\t");
		}

		Arrays.sort(names);

		System.out.println();
		System.out.println("***�����***");
		for (String n : names) {
			System.out.print(n + "\t");
		}

	}

}
