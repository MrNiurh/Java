package Java3_bank.com;

public class Account {

	double money = 0;

	public void saveMoney(double add) {

		money += add;// ������

		System.out.println("���ɹ�");
		System.out.println();
		System.out.println("***��ǰ���Ϊ:" + money + "Ԫ***");

	}

	public void takeMoney(double del) {

		if (money >= del) {// ȡ�����
			money -= del;
			System.out.println("ȡ��ɹ�");
			System.out.println();
			System.out.println("***��ǰ���Ϊ:" + money + "Ԫ***");
		}

		else// ����
			System.out.println("����!");

	}

}
