package Java1;

import java.util.Scanner;

public class Page107 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额:");
		int money = input.nextInt();

		int line[] = { 0, 50, 100, 100, 200, 200 };// 需满足条件金额
		int moreMoney[] = { 0, 2, 3, 10, 10, 20 };// 需增加金额
		String moreProduction[] = { "未换购", "百事可乐饮料1瓶", "500ml可乐1瓶", "5公斤面粉", "1个苏泊尔炒菜锅", "欧莱雅爽肤水1瓶" };// 换购物品

		System.out.println("是否参加优惠换购活动:");// 可换购选项
		System.out.println("1:满" + line[1] + "元,加" + moreMoney[1] + "元换购" + moreProduction[1]);
		System.out.println("2:满" + line[2] + "元,加" + moreMoney[2] + "元换购" + moreProduction[2]);
		System.out.println("3.满" + line[3] + "元,加" + moreMoney[3] + "元换购" + moreProduction[3]);
		System.out.println("4.满" + line[3] + "元,加" + moreMoney[4] + "元换购" + moreProduction[4]);
		System.out.println("5.满" + line[4] + "元,加" + moreMoney[5] + "元换购" + moreProduction[5]);
		System.out.println("0.不换购");

		for (;;) {// 用以不满足条件的循环
			System.out.print("请选择:");
			int number = input.nextInt();// 输入换购选项
			if (number < 0 || number > 5) {// 判断是否在指定区间
				System.out.println("未在指定区间");// 未在指定区间,回到初选项
				continue;
			} else if (money >= line[number]) {// 判断是否满足换购条件
				System.out.println("本次消费总金额:" + (money + moreMoney[number]));
				System.out.println("成功换购:" + moreProduction[number]);
				break;
			} else {
				System.out.println("未达到指定消费金额!");// 未达到消费要求,回到初选项
				continue;
			}

		}
	}

}
