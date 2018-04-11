package Java2;

import java.util.Scanner;

public class Page9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("检查合格了吗?y/n");
		String check = input.nextLine();
		while (!"y".equals(check)) {

			System.out.println("上午阅读教材!");
			System.out.println("下午上机编程!");
			System.out.println("检查合格了吗?y/n");
			check = input.nextLine();
		}
		System.out.println("完成学习任务!");
	}

}
