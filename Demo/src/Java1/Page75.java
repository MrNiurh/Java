package Java1;

import java.util.Scanner;

public class Page75 {

	public static void main(String[] args) {

		int line = 100;
		double discount = 1;

		for (;;) {
			Scanner input = new Scanner(System.in);
			System.out.println("�������ۿ�:");
			discount = input.nextDouble();
			if (discount > 1 || discount <= 0) {
				System.out.println("�ۿ�����(0-1]");
				continue;
			} else
				break;
		}
		// ��Ʒ
		String production[] = { "T��", "����Ь", "������" };
		// ����
		double perprice[] = { 245, 570, 320 };

		for (int i = 0; i < 3; i++) {// �����Ƿ���������
			System.out.println(production[i] + "�ۿۼ۵���" + line + "��?" + (perprice[i] * discount < line));
		}

	}

}
