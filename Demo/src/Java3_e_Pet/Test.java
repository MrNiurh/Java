package Java3_e_Pet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.strain = "雪纳瑞";
		dog.setHealth(100);
		dog.setLove(0);
		dog.setName("欧欧");

		Penguin penguin = new Penguin();
		penguin.sex = "雌";
		penguin.setHealth(100);
		penguin.setLove(0);
		penguin.setName("楠楠");

		dog.print();
		dog.myStrain();

		penguin.print();
		penguin.mySex();

	}

}
