package Java2;

import java.util.Scanner;

public class Page50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("请输入用户名:");
			String userName = input.next();
			System.out.print("请输入密码:");
			String userPassword = input.next();
			if (userName.equals("jim") && userPassword.equals("123456")) {
				System.out.println("欢迎登陆MyShopping系统");
				break;

			} else {
				System.out.println("输入错误!您还有" + (2 - i) + "次机会!\n");
				if (i == 2) {
					System.out.println("对不起,您3次输入均错误!");
					break;
				}
				continue;
			}
		}
	}

}
