package Java1;

import java.util.Scanner;

public class Page73 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		for (;;) {
			System.out.println("��������λ��Ա����:");
			int number = input.nextInt();// �������
			int temp = number;// �ݴ����
			if (number > 9999 || number < 1000) {// �ж��Ƿ�Ϊ��λ
				System.out.println("�������!!!");
				continue;
			} else {
				int sum = 0;// ��ʼ�����ֺ�
				for (int i = 0; i < 4; i++) {// �������
					sum += number % 10;
					number /= 10;
				}

				System.out.println("��Ա����" + temp + "��λ��Ϊ:" + sum);
				System.out.println("�����˿ͻ���?" + (sum > 20));

			}

			break;
		}

	}

}
