package Java3;

import java.util.Arrays;
import java.util.Scanner;

public class Page6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];// 初始化
		Scanner input = new Scanner(System.in);
		System.out.println("n退出");
		for (int i = 1; i <= 5; i++) {// 循环

			System.out.print("请输入第" + i + "个学生的名字:");
			String name = input.next();
			names[i - 1] = name;

		}

		sortNames(names);

	}

	static void sortNames(String[] names) {// 方法体

		Arrays.sort(names);// 排序

		System.out.println("***排序后***");
		for (String n : names) {// 输出

			System.out.print(n + "\t");
		}

	}

}
