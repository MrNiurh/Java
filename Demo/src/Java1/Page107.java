package Java1;

import java.util.Scanner;

public class Page107 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("���������ѽ��:");
		int money = input.nextInt();

		int line[] = { 0, 50, 100, 100, 200, 200 };// �������������
		int moreMoney[] = { 0, 2, 3, 10, 10, 20 };// �����ӽ��
		String moreProduction[] = { "δ����", "���¿�������1ƿ", "500ml����1ƿ", "5�������", "1���ղ������˹�", "ŷ����ˬ��ˮ1ƿ" };// ������Ʒ

		System.out.println("�Ƿ�μ��Żݻ����:");// �ɻ���ѡ��
		System.out.println("1:��" + line[1] + "Ԫ,��" + moreMoney[1] + "Ԫ����" + moreProduction[1]);
		System.out.println("2:��" + line[2] + "Ԫ,��" + moreMoney[2] + "Ԫ����" + moreProduction[2]);
		System.out.println("3.��" + line[3] + "Ԫ,��" + moreMoney[3] + "Ԫ����" + moreProduction[3]);
		System.out.println("4.��" + line[3] + "Ԫ,��" + moreMoney[4] + "Ԫ����" + moreProduction[4]);
		System.out.println("5.��" + line[4] + "Ԫ,��" + moreMoney[5] + "Ԫ����" + moreProduction[5]);
		System.out.println("0.������");

		for (;;) {// ���Բ�����������ѭ��
			System.out.print("��ѡ��:");
			int number = input.nextInt();// ���뻻��ѡ��
			if (number < 0 || number > 5) {// �ж��Ƿ���ָ������
				System.out.println("δ��ָ������");// δ��ָ������,�ص���ѡ��
				continue;
			} else if (money >= line[number]) {// �ж��Ƿ����㻻������
				System.out.println("���������ܽ��:" + (money + moreMoney[number]));
				System.out.println("�ɹ�����:" + moreProduction[number]);
				break;
			} else {
				System.out.println("δ�ﵽָ�����ѽ��!");// δ�ﵽ����Ҫ��,�ص���ѡ��
				continue;
			}

		}
	}

}
