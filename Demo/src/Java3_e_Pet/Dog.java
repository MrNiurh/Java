package Java3_e_Pet;

public class Dog extends Pet {

	public String strain;

	public String getStrain() {
		return strain;
	}

	public void myStrain() {
		System.out.println("我是一只" + strain + "犬");
	}

}
