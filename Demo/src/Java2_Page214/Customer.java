package Java2_Page214;

import java.util.Scanner;

public class Customer {

	Scanner input = new Scanner(System.in);

	public String Names[] = new String[5];// ��ʼ������,���ó���Ϊ5

	public String addName(String name) {// ��������

		return name;
	}

	public void showNames() {// ��ʾ���������

		for (int i = 0; i < Names.length; i++) {

			System.out.print(Names[i] + "\t");

		}
	}

	public void changeName() {

		System.out.println("������Ҫ�޸ĵĿͻ�����:");
		String name = input.next();
		System.out.println("�������µĿͻ�����:");
		String newName = input.next();
		for (int i = 0; i < Names.length; i++) {// ��������

			if (Names[i].equals(name)) {// �ж���������
				Names[i] = newName;// ��ֵ
				System.out.println("*******�޸Ľ��*******");
				System.out.println("�ҵ����޸ĳɹ�!");
				break;
			}

			else if (i == Names.length) {// �ж�����������
				System.out.println("*******�޸Ľ��*******");
				System.out.println("���޴���!");

			}

		}

	}
}
