package Java3_bank.com;

import java.util.Scanner;

public class bankOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);// ʵ����
		Account acc = new Account();
		int exchange;

		for (;;) {
			System.out.println();
			System.out.println("1.���  2.ȡ��  0.�˳�");
			System.out.print("��ѡ������Ҫ�����ҵ��:");
			int choice = input.nextInt();
			if (choice == 0)
				break;

			switch (choice) {// ҵ��ѡ��

			case 1:// ���
				System.out.print("����������:");
				exchange = input.nextInt();
				acc.saveMoney(exchange);
				break;
			case 2:// ȡ��
				System.out.print("������ȡ����:");
				exchange = input.nextInt();
				acc.takeMoney(exchange);
				break;
			case 0:// �˳�
				System.out.println("ллʹ��!");
				break;
			default:// �������
				System.out.println("����ʧ��!");

			}

		}

	}

}
