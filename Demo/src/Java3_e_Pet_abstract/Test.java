package Java3_e_Pet_abstract;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Master master = new Master();

		Dog dog = new Dog();
		dog.setHealth(100);
		dog.setLove(0);
		dog.setName("ŷŷ");

		dog.print();
		master.feed(dog);
		dog.print();

	}

}
