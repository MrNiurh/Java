package Java2;

import java.util.Scanner;

public class Page15 {

	public static void main(String[] args) {

		System.out.println("商品编号");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("**************************************************************");
		System.out.println();
		System.out.println();
		double summary = 0;
		String check = "y";
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("请输入购买的商品编号:");
			int number = input.nextInt();
			System.out.print("请输入购买的数量:");
			int count = input.nextInt();
			double[] price = { 245.0, 300.0, 100.0 };
			double sum = price[number - 1] * count;
			switch (number) {
			case 1:
				System.out.println("T恤¥245.0\t数量" + count + "\t合计¥" + sum);
				break;
			case 2:
				System.out.println("网球鞋¥300.0\t数量" + count + "\t合计¥" + sum);
				break;
			case 3:
				System.out.println("网球拍¥100.0\t数量" + count + "\t合计¥" + sum);
				break;
			}
			summary += sum;

			System.out.println("是否继续?y/n");
			check = input.next();
		} while ("y".equals(check));

		System.out.println("折扣:0.8");
		System.out.println("应付金额" + summary*0.8);
		System.out.print("实付金额");
		int money = input.nextInt();
		System.out.println("找钱:" + (money - summary * 0.8));

	}
}
