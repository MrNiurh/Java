package Java2;

import java.util.Scanner;

public class Page50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("�������û���:");
			String userName = input.next();
			System.out.print("����������:");
			String userPassword = input.next();
			if (userName.equals("jim") && userPassword.equals("123456")) {
				System.out.println("��ӭ��½MyShoppingϵͳ");
				break;

			} else {
				System.out.println("�������!������" + (2 - i) + "�λ���!\n");
				if (i == 2) {
					System.out.println("�Բ���,��3�����������!");
					break;
				}
				continue;
			}
		}
	}

}
