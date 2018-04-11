package Java1;

import java.util.Scanner;

public class Page75 {

	public static void main(String[] args) {

		int line = 100;
		double discount = 1;

		for (;;) {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入折扣:");
			discount = input.nextDouble();
			if (discount > 1 || discount <= 0) {
				System.out.println("折扣区间(0-1]");
				continue;
			} else
				break;
		}
		// 商品
		String production[] = { "T恤", "网球鞋", "网球拍" };
		// 单价
		double perprice[] = { 245, 570, 320 };

		for (int i = 0; i < 3; i++) {// 计算是否满足条件
			System.out.println(production[i] + "折扣价低于" + line + "吗?" + (perprice[i] * discount < line));
		}

	}

}
