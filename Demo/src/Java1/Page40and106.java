package Java1;

import java.util.Scanner;

public class Page40and106 {

	public static void main(String[] args) {

		System.out.println("\t\t��ӭʹ�ù������ϵͳ\n");
		for (int i = 0; i < 30; i++) {
			System.out.print("* ");
		}
		System.out.println("\n");
		System.out.println("\t\t 1.��¼ϵͳ\n");
		System.out.println("\t\t 2.�˳�\n");

		for (int i = 0; i < 30; i++) {
			System.out.print("* ");
		}
		System.out.println("\n");
		System.out.println("��ѡ��,��������:");

		// ����ѡ��
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		// ѡ����
		switch (num) {
		
		// ��һ������
		case 1:

			System.out.println("\t\t��ӭʹ�ù������ϵͳ\n");
			for (int i = 0; i < 30; i++) {
				System.out.print("* ");
			}
			System.out.println("\n");
			System.out.println("\t\t 1.�ͻ���Ϣ����\n");
			System.out.println("\t\t 2.�������\n");
			System.out.println("\t\t 1.�������\n");
			System.out.println("\t\t 2.ע��\n");

			for (int i = 0; i < 30; i++) {
				System.out.print("* ");
			}
			System.out.println("\n");
			System.out.println("��ѡ��,��������:");
			break;

		// �˳�
		case 2:
			System.out.println("лл����ʹ��~");
			break;

		// ��������
		default:
			System.out.println("error!!!");
			break;
		}
	}
}
