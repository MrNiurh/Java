package Java3_e_Pet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.strain = "ѩ����";
		dog.setHealth(100);
		dog.setLove(0);
		dog.setName("ŷŷ");

		Penguin penguin = new Penguin();
		penguin.sex = "��";
		penguin.setHealth(100);
		penguin.setLove(0);
		penguin.setName("��");

		dog.print();
		dog.myStrain();

		penguin.print();
		penguin.mySex();

	}

}
