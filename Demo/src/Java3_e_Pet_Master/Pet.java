package Java3_e_Pet_Master;

public abstract class Pet {

	public abstract void print();

	private String name;
	private int health = 100;
	private int love = 20;
	private String sex;

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public void eat() {

		System.out.println("进食...");
		System.out.println("进食完毕    love +4");

	}

}
