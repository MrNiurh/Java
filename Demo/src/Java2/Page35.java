package Java2;

public class Page35 {

	public static void main(String[] args) {
		// ����100����������

		int sum = 0;
		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 1)
				sum += i;
		}
		System.out.println("100����������Ϊ:" + sum);
	}

}
