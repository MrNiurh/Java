package Java3_Page108;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("请输入年龄:");
		int age = input.nextInt();// 输入年龄

		Age a = new Age();
		a.setAge(age);

	}

}
