package Java2;

import java.util.Arrays;
import java.util.Scanner;

public class Page96 {

	public static void main(String[] args) {
		// �������гɼ�

		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("������5λѧԱ�ĳɼ�");

		for (int i = 0; i < 5; i++) {

			scores[i] = input.nextInt();
		}

		Arrays.sort(scores);

		System.out.println("ѧԱ�ɼ�����������:");
		for (int i = 0; i < 5; i++) {

			System.out.print(scores[i] + "  ");
		}
	}

}
