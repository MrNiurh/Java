package Java2;

import java.util.Scanner;

public class Page63 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("请输入等腰三角形的行数:");
		int rows = input.nextInt();// 输入行数

		for (int i = 1; i <= rows; i++) {// 循环控制行数

			for (int j = 0; j < rows - i; j++) {// 打印空格
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i - 1; j++) {// 打印*
				System.out.print("*");
			}
			System.out.println();// 换行
		}

	}

}
