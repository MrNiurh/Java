package Java2_Page214;

import java.util.Scanner;

import Java2_Page213.CustomerBiz;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name;

		Customer cus = new Customer();

		for (int i = 0; i < 5; i++) {// ����5���˿�

			System.out.print("������˿�����:");
			name = input.next();// ��������
			cus.Names[i] = cus.addName(name);// ��������������
		}

		System.out.println("*****************************");
		System.out.println();
		System.out.println("\t�˿������б�");
		System.out.println();
		System.out.println("*****************************");
		cus.showNames();// ��ʼ���
		System.out.println();
		System.out.println();
		cus.changeName();// ������

		System.out.println("*****************************");
		System.out.println();
		System.out.println("\t�˿������б�");
		System.out.println();
		System.out.println("*****************************");
		cus.showNames();// ��ʼ���
	}

}
