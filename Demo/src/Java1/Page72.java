package Java1;

import java.util.Scanner;

public class Page72 {

	public static void main(String[] args) {

		// �?�?
		for (int i = 0; i < 16; i++) {
			System.out.print("*");
			if (i == 7) {
				System.out.print("消费�?");
			}
		}
		System.out.println();

		// 商品
		String production[] = { "T�?", "网球�?", "网球�?" };
		// 单价
		int perprice[] = { 245, 570, 320 };
		// 数量
		int[] count = new int[3];
		Scanner input = new Scanner(System.in);

		// 条目制表
		System.out.print("购买商品\t");
		System.out.print("单价\t");
		System.out.print("数量\n");

		for (int i = 0; i < 3; i++) {
			System.out.print(production[i] + "\t");// 商品
			System.out.print("¥" + perprice[i] + "\t");// 单价
			int num = input.nextInt();// 输入数量
			count[i] = num;// 存储到数�?
			System.out.print("金额:¥" + perprice[i] * count[i] + "\n\n");
		}

		System.out.print("折扣:\t");
		double discount = input.nextDouble();// 输入折扣
		double summary = 0;
		for (int i = 0; i < 3; i++) {// 计算实际总价
			summary += perprice[i] * count[i] * discount / 10;
		}
		System.out.println("消费总金额\t" + "¥" + summary);// 输出实际总价
		System.out.print("实际交费\t" + "¥");// 顾客交费�?
		double money = input.nextDouble();
		System.out.println("找钱\t" + "¥" + (money - summary));// 找钱�?
		int points = (int) (summary * 0.03);// 计算积分
		System.out.println("本次购物�?获积分是:" + points);
	}

}
