package Java3_e_Pet_abstract;

public class Master {

	public void feed(Pet pet) {
		
		pet.eat();
		pet.setLove(pet.getLove() + 4);
		
	}

}
