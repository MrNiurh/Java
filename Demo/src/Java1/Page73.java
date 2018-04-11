package Java1;

import java.util.Scanner;

public class Page73 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		for (;;) {
			System.out.println("请输入四位会员卡号:");
			int number = input.nextInt();// 输入号码
			int temp = number;// 暂存号码
			if (number > 9999 || number < 1000) {// 判断是否为四位
				System.out.println("输入错误!!!");
				continue;
			} else {
				int sum = 0;// 初始化数字和
				for (int i = 0; i < 4; i++) {// 号码求和
					sum += number % 10;
					number /= 10;
				}

				System.out.println("会员卡号" + temp + "各位和为:" + sum);
				System.out.println("是幸运客户吗?" + (sum > 20));

			}

			break;
		}

	}

}
