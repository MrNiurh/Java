package Java2;

import java.util.Arrays;
import java.util.Scanner;

public class Page96 {

	public static void main(String[] args) {
		// 升序排列成绩

		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩");

		for (int i = 0; i < 5; i++) {

			scores[i] = input.nextInt();
		}

		Arrays.sort(scores);

		System.out.println("学员成绩按升序排列:");
		for (int i = 0; i < 5; i++) {

			System.out.print(scores[i] + "  ");
		}
	}

}
