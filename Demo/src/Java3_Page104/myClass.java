package Java3_Page104;

import java.util.Scanner;

public class myClass {

	String[] lessons = { "C#应用编程", "Java", "C++" };

	void chooseLesson() {

		Scanner input = new Scanner(System.in);

		System.out.print("请输入课程代号(1~3之间的数字):");

		try {
			int lessonNumber = input.nextInt();
			System.out.println(lessons[lessonNumber - 1]);
		} catch (Exception e) {
			System.out.println("输入错误");
			e.printStackTrace();
		} finally {
			System.out.println("欢迎提出建议");
		}

	}

}
