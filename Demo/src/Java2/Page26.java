package Java2;

import java.util.Scanner;

public class Page26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ������:");
		String name = input.nextLine();
		double summary = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("������5�ſ��е�" + (i + 1) + "�ſεĳɼ�:");
			int scores = input.nextInt();
			summary += scores;
		}
		System.out.println(name + "��ƽ������:" + summary / 5);
	}

}
