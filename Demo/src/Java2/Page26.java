package Java2;

import java.util.Scanner;

public class Page26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("输入学生姓名:");
		String name = input.nextLine();
		double summary = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("请输入5门课中第" + (i + 1) + "门课的成绩:");
			int scores = input.nextInt();
			summary += scores;
		}
		System.out.println(name + "的平均分是:" + summary / 5);
	}

}
