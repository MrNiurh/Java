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

		System.out.println("������԰�:");
		System.out.println("�ҵ����ֽ�" + name + ",�ҵĽ���ֵ��" + health + ",�Һ����˵����ܶ���" + love);
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
