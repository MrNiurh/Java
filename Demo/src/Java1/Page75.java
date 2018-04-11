package Java1;

import java.util.Scanner;

public class Page75 {

	public static void main(String[] args) {

		int line = 100;
		double discount = 1;

		for (;;) {
			Scanner input = new Scanner(System.in);
			System.out.println("ÇëÊäÈëÕÛ¿Û:");
			discount = input.nextDouble();
			if (discount > 1 || discount <= 0) {
				System.out.println("ÕÛ¿ÛÇø¼ä(0-1]");
				continue;
			} else
				break;
		}
		// ÉÌÆ·
		String production[] = { "TÐô", "ÍøÇòÐ¬", "ÍøÇòÅÄ" };
		// µ¥¼Û
		double perprice[] = { 245, 570, 320 };

		for (int i = 0; i < 3; i++) {// ¼ÆËãÊÇ·ñÂú×ãÌõ¼þ
			System.out.println(production[i] + "ÕÛ¿Û¼ÛµÍÓÚ" + line + "Âð?" + (perprice[i] * discount < line));
		}

	}

}
