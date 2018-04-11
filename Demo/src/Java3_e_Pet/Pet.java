package Java3_e_Pet;

public class Pet {

	private String name;
	private int health;
	private int love;

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	public void print() {

		System.out.println("宠物的自白:");
		System.out.println("我的名字叫" + name + ",我的健康值是" + health + ",我和主人的亲密度是" + love);
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

}
