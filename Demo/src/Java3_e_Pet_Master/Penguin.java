package Java3_e_Pet_Master;

public class Penguin extends Pet {

	@Override
	public void print() {

		System.out.println("宠物的自白:");
		System.out.println("我是一只小企鹅");
		System.out.println(
				"我的名字叫" + getName() + ",我的健康值是" + getHealth() + ",我和主人的亲密度是" + getLove() + ",我的性别是:" + getSex());

	}

}
