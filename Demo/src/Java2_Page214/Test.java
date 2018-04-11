package Java2_Page214;

import java.util.Scanner;

import Java2_Page213.CustomerBiz;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name;

		Customer cus = new Customer();

		for (int i = 0; i < 5; i++) {// 遍历5名顾客

			System.out.print("请输入顾客姓名:");
			name = input.next();// 输入姓名
			cus.Names[i] = cus.addName(name);// 将姓名存入数组
		}

		System.out.println("*****************************");
		System.out.println();
		System.out.println("\t顾客姓名列表");
		System.out.println();
		System.out.println("*****************************");
		cus.showNames();// 开始输出
		System.out.println();
		System.out.println();
		cus.changeName();// 改名字

		System.out.println("*****************************");
		System.out.println();
		System.out.println("\t顾客姓名列表");
		System.out.println();
		System.out.println("*****************************");
		cus.showNames();// 开始输出
	}

}
