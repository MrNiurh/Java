package Java2;

import java.util.Scanner;

public class Page36 {

	public static void main(String[] args) {
		// �������������ռ�ı���

		double low = 0, high = 0;

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {

			System.out.print("�������" + (i + 1) + "λ�˿͵�����:");
			int age = input.nextInt();
			if (age > 30)
				high++;
			else
				low++;
		}
		System.out.println("30�����µı�����:" + 10 * low + "%");
		System.out.println("30�����ϵı�����:" + 10 * high + "%");
	}

}
