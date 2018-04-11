package Java3_e_Pet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.strain = "Ñ©ÄÉÈð";
		dog.setHealth(100);
		dog.setLove(0);
		dog.setName("Å·Å·");

		Penguin penguin = new Penguin();
		penguin.sex = "´Æ";
		penguin.setHealth(100);
		penguin.setLove(0);
		penguin.setName("éªéª");

		dog.print();
		dog.myStrain();

		penguin.print();
		penguin.mySex();

	}

}
