package Java2;

import java.util.Scanner;

public class Page36 {

	public static void main(String[] args) {
		// 计算各年龄层次所占的比例

		double low = 0, high = 0;

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {

			System.out.print("请输入第" + (i + 1) + "位顾客的年龄:");
			int age = input.nextInt();
			if (age > 30)
				high++;
			else
				low++;
		}
		System.out.println("30岁以下的比例是:" + 10 * low + "%");
		System.out.println("30岁以上的比例是:" + 10 * high + "%");
	}

}
