package Java1;

import java.util.Scanner;

public class Page96 {

	public static void main(String[] args) {

		double discount = 1;
		double money;
		Scanner input = new Scanner(System.in);
		String mumbership;
		System.out.println("�������Ƿ��ǻ�Ա:��(y)/��(�����ַ�)");
		mumbership = input.nextLine();// �Ƿ��Ա
		System.out.println("�����빺����");
		money = input.nextDouble();// ���빺����

		if (mumbership.equals("y")) {// equals!!!!
			discount = 0.8;// vip
			if (money >= 200) {
				discount = 0.75;
			}
		} else if (money >= 100) {// normal
			discount = 0.9;
		}
		System.out.println("ʵ��֧��:" + (money * discount));

	}

}
