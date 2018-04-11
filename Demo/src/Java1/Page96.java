package Java1;

import java.util.Scanner;

public class Page96 {

	public static void main(String[] args) {

		double discount = 1;
		double money;
		Scanner input = new Scanner(System.in);
		String mumbership;
		System.out.println("请输入是否是会员:是(y)/否(其他字符)");
		mumbership = input.nextLine();// 是否会员
		System.out.println("请输入购物金额");
		money = input.nextDouble();// 输入购物金额

		if (mumbership.equals("y")) {// equals!!!!
			discount = 0.8;// vip
			if (money >= 200) {
				discount = 0.75;
			}
		} else if (money >= 100) {// normal
			discount = 0.9;
		}
		System.out.println("实际支付:" + (money * discount));

	}

}
