package Java3_e_Pet_Master;

import java.util.Scanner;

public class petStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String myPet = "";
		String petSex = "";
		System.out.println("��ӭ�����������");
		System.out.print("������Ҫ�������������:");
		String petName = input.next();
		Pet[] pet = { new Dog(), new Penguin() };

		System.out.print("��ѡ��Ҫ�����ĳ�������: (1.����    2.���)");
		int petNumber = input.nextInt();
		System.out.print("��ѡ��" + myPet + "���Ա�:(1.�� 2.��)");
		int petSexNumber = input.nextInt();
		switch (petSexNumber) {
		case 1:
			petSex = "��";
			break;
		case 2:
			petSex = "��";
			break;
		default:
			break;
		}

		if (petNumber == 1) {
			myPet = "����";

		} else if (petNumber == 2) {
			myPet = "���";

		}

		pet[petNumber - 1].setName(petName);
		pet[petNumber - 1].setSex(petSex);
		pet[petNumber - 1].print();

	}

}
