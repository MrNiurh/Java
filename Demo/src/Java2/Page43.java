package Java2;

public class Page43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println("��1�ۼ���" + i + "�ĺ�>20");
				break;
			}
		}
	}

}
