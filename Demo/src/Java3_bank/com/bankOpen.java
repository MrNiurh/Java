package Java3_bank.com;

import java.util.Scanner;

public class bankOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);// 实例化
		Account acc = new Account();
		int exchange;

		for (;;) {
			System.out.println();
			System.out.println("1.存款  2.取款  0.退出");
			System.out.print("请选择您需要办理的业务:");
			int choice = input.nextInt();
			if (choice == 0)
				break;

			switch (choice) {// 业务选择

			case 1:// 存款
				System.out.print("请输入存款金额:");
				exchange = input.nextInt();
				acc.saveMoney(exchange);
				break;
			case 2:// 取款
				System.out.print("请输入取款金额:");
				exchange = input.nextInt();
				acc.takeMoney(exchange);
				break;
			case 0:// 退出
				System.out.println("谢谢使用!");
				break;
			default:// 错误操作
				System.out.println("操作失败!");

			}

		}

	}

}
