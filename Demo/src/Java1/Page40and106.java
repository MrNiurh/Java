package Java1;

import java.util.Scanner;

public class Page40and106 {

	public static void main(String[] args) {

		System.out.println("\t\t欢迎使用购物管理系统\n");
		for (int i = 0; i < 30; i++) {
			System.out.print("* ");
		}
		System.out.println("\n");
		System.out.println("\t\t 1.登录系统\n");
		System.out.println("\t\t 2.退出\n");

		for (int i = 0; i < 30; i++) {
			System.out.print("* ");
		}
		System.out.println("\n");
		System.out.println("请选择,输入数字:");

		// 输入选择
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		// 选项结果
		switch (num) {
		
		// 下一个界面
		case 1:

			System.out.println("\t\t欢迎使用购物管理系统\n");
			for (int i = 0; i < 30; i++) {
				System.out.print("* ");
			}
			System.out.println("\n");
			System.out.println("\t\t 1.客户信息管理\n");
			System.out.println("\t\t 2.购物结算\n");
			System.out.println("\t\t 1.真情回馈\n");
			System.out.println("\t\t 2.注销\n");

			for (int i = 0; i < 30; i++) {
				System.out.print("* ");
			}
			System.out.println("\n");
			System.out.println("请选择,输入数字:");
			break;

		// 退出
		case 2:
			System.out.println("谢谢您的使用~");
			break;

		// 错误输入
		default:
			System.out.println("error!!!");
			break;
		}
	}
}
