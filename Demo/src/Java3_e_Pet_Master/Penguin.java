package Java3_e_Pet_Master;

public class Penguin extends Pet {

	@Override
	public void print() {

		System.out.println("������԰�:");
		System.out.println("����һֻС���");
		System.out.println(
				"�ҵ����ֽ�" + getName() + ",�ҵĽ���ֵ��" + getHealth() + ",�Һ����˵����ܶ���" + getLove() + ",�ҵ��Ա���:" + getSex());

	}

}
