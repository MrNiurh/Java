package Java3_e_Pet_Master;

import java.util.Scanner;

public class petStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String myPet = "";
		String petSex = "";
		System.out.println("欢迎您来到宠物店");
		System.out.print("请输入您要领养宠物的名字:");
		String petName = input.next();
		Pet[] pet = { new Dog(), new Penguin() };

		System.out.print("请选择要领养的宠物的类型: (1.狗狗    2.企鹅)");
		int petNumber = input.nextInt();

		if (petNumber == 1) {// 确定所选宠物
			myPet = "狗狗";

		} else if (petNumber == 2) {
			myPet = "企鹅";

		}

		System.out.print("请选择" + myPet + "的性别:(1.雄   2.雌)");
		int petSexNumber = input.nextInt();

		switch (petSexNumber) {// 确定性别
		case 1:
			petSex = "雄";
			break;
		case 2:
			petSex = "雌";
			break;
		default:
			break;
		}

		pet[petNumber - 1].setName(petName);// 传入姓名
		pet[petNumber - 1].setSex(petSex);// 姓名
		pet[petNumber - 1].print();// 自白

	}

}
