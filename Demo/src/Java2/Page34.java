package Java2;

public class Page34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 != 0)
				sum += i;
		}
		System.out.println("1~100不能被3整除的数和为:" + sum);

	}

}
