package Java2;

public class Page10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double students = 250000;
		int year = 2012;
		while (students <= 1000000) {

			students *= (1 + 0.25);
			year++;
		}
		System.out.println("到" + year + "年培训学员将达到100万人!");
	}

}
