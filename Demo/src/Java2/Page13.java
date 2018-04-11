package Java2;

import java.util.Scanner;

public class Page13 {

	public static void main(String[] args) {

		System.out.println("MyShopping管理系统 > 购物结算");
		System.out.println();
		System.out.println("**************************************************************");

		Scanner input = new Scanner(System.in);
		System.out.println("请选择购买的商品编号:");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("**************************************************************");

		String check = "y";
		while ("y".equals(check)) {
			System.out.print("请输入商品编号:");
			int number = input.nextInt();

			switch (number) {
			case 1:
				System.out.println("T恤\t¥245.0");
				break;
			case 2:
				System.out.println("网球鞋\t¥300.0");
				break;
			case 3:
				System.out.println("球拍\t¥100.0");
				break;
			default:
				System.out.println("输入错误!");
				break;
			}

			System.out.print("是否继续(y/n)");

			check = input.next();
			

		}
		System.out.println("程序结束!");

	}
}
