package Java2_Page214;

import java.util.Scanner;

public class Customer {

	Scanner input = new Scanner(System.in);

	public String Names[] = new String[5];// 初始化数组,设置长度为5

	public String addName(String name) {// 增添姓名

		return name;
	}

	public void showNames() {// 显示输入的姓名

		for (int i = 0; i < Names.length; i++) {

			System.out.print(Names[i] + "\t");

		}
	}

	public void changeName() {

		System.out.println("请输入要修改的客户姓名:");
		String name = input.next();
		System.out.println("请输入新的客户姓名:");
		String newName = input.next();
		for (int i = 0; i < Names.length; i++) {// 遍历数组

			if (Names[i].equals(name)) {// 判断姓名存在
				Names[i] = newName;// 赋值
				System.out.println("*******修改结果*******");
				System.out.println("找到并修改成功!");
				break;
			}

			else if (i == Names.length) {// 判断姓名不存在
				System.out.println("*******修改结果*******");
				System.out.println("查无此人!");

			}

		}

	}
}
