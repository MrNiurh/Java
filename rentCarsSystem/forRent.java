package rentCarsSystem;

import java.util.Scanner;

public class forRent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StringBuffer peopleCar = new StringBuffer();// 初始化数组：可载人的车
		StringBuffer storageCar = new StringBuffer();// 初始化数组： 可载货的车

		int allPeople = 0;// 用于存储总人数
		int allStorage = 0;// 同于存储总载货
		double sumPrice = 0;// 用于存储总价

		Cars[] cars = { new car("小轿车", 500, 4), new bus("大巴", 800, 20), new smallOne("小货车", 400, 4),
				new bigOne("大货车", 1000, 20), new PickUp("皮卡", 450, 4, 2) };// 实例化车型

		int check = 1;// 初始化需判断条件为真

		do {// 开始执行
			System.out.println("欢迎使用达达租车系统");
			System.out.println("您是否要租车：1是 0否");
			check = input.nextInt();// 输入判断条件
			if (check == 0)// 退出
				break;
			System.out.println("您可租车的类型及价目表：");
			System.out.println("序号\t汽车名称\t租金\t\t容量");

			for (int i = 0; i < cars.length; i++) {// 打印车辆信息

				System.out.print((i + 1) + ".\t" + cars[i].name + "\t¥" + cars[i].rentPrice + "/天\t\t");
				if (cars[i].takePeople != 0) {
					System.out.print("载人：" + cars[i].takePeople + "人 ");
				}
				if (cars[i].takeStorage != 0) {
					System.out.print("载货：" + cars[i].takeStorage + "吨 ");
				}

				System.out.println();

			}

			System.out.println("请输入要租车的数量：");
			int amount = input.nextInt();// 输入租车数量
			for (int i = 0; i < amount; i++) {
				System.out.println("请输入第" + (i + 1) + "辆车的序号");
				int number = input.nextInt();// 输入租车型号

				allPeople += cars[number - 1].takePeople;// 载人加和
				allStorage += cars[number - 1].takeStorage;// 载货加和
				sumPrice += cars[number - 1].rentPrice;// 价格加和

				if (cars[number - 1].takePeople != 0) {// 可载人车辆录入
					peopleCar.append(cars[number - 1].name + "  ");
				}
				if (cars[number - 1].takeStorage != 0) {// 可载货车辆录入
					storageCar.append(cars[number - 1].name + " ");
				}

			}

			System.out.println("请输入租车天数：");
			int rentDays = input.nextInt();// 输入租车天数
			sumPrice *= rentDays;// 租车价格*租用天数 计算总价

			System.out.println("您的账单");
			System.out.println("***可载人的车有：");
			System.out.println(peopleCar + "共载人：" + allPeople + "人");
			System.out.println("***可载货的车有：");
			System.out.println(storageCar + "共载货：" + allStorage + "吨");
			System.out.println("***租车总价格：¥" + sumPrice);

		} while (check != 1);

		System.out.println("谢谢使用");
	}

}
