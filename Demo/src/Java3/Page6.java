package Java3;

import java.util.Arrays;
import java.util.Scanner;

public class Page6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];// ��ʼ��
		Scanner input = new Scanner(System.in);
		System.out.println("n�˳�");
		for (int i = 1; i <= 5; i++) {// ѭ��

			System.out.print("�������" + i + "��ѧ��������:");
			String name = input.next();
			names[i - 1] = name;

		}

		sortNames(names);

	}

	static void sortNames(String[] names) {// ������

		Arrays.sort(names);// ����

		System.out.println("***�����***");
		for (String n : names) {// ���

			System.out.print(n + "\t");
		}

	}

}
