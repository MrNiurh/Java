package Java2_Page213;

public class CustomerBiz {

	public String Names[] = new String[60];

	public String addName(String name) {

		return name;
	}

	public void showNames() {

		for (int i = 0; i < Names.length; i++) {

			if (Names[i] == null)
				break;
			System.out.print(Names[i] + "\t");
		}
	}
}
