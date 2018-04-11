package Java2_Page213;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name;
		String check;

		CustomerBiz cus = new CustomerBiz();

		for (int i = 0;; i++) {

			System.out.print("请输入顾客姓名:");
			name = input.next();
			cus.Names[i] = cus.addName(name);
			System.out.print("继续输入吗?(y/n)");
			check = input.next();
			if (check.equals("y"))
				continue;
			else
				break;
		}
		System.out.println("*****************************");
		System.out.println();
		System.out.println("\t顾客姓名列表");
		System.out.println();
		System.out.println("*****************************");
		cus.showNames();
	}
}
