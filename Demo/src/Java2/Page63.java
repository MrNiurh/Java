package Java2;

import java.util.Scanner;

public class Page63 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("��������������ε�����:");
		int rows = input.nextInt();// ��������

		for (int i = 1; i <= rows; i++) {// ѭ����������

			for (int j = 0; j < rows - i; j++) {// ��ӡ�ո�
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i - 1; j++) {// ��ӡ*
				System.out.print("*");
			}
			System.out.println();// ����
		}

	}

}
