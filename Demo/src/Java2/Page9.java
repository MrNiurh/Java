package Java2;

import java.util.Scanner;

public class Page9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("���ϸ�����?y/n");
		String check = input.nextLine();
		while (!"y".equals(check)) {

			System.out.println("�����Ķ��̲�!");
			System.out.println("�����ϻ����!");
			System.out.println("���ϸ�����?y/n");
			check = input.nextLine();
		}
		System.out.println("���ѧϰ����!");
	}

}
