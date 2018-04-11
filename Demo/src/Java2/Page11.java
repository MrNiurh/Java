package Java2;

public class Page11 {

	public static void main(String[] args) {

		int summary = 0;
		int number = 0;
		while (number <= 100) {

			if (number % 2 == 0) {
				summary += number;
			}
			number++;
		}
		System.out.println("100以内(含100)的偶数和是:" + summary);
	}
}
