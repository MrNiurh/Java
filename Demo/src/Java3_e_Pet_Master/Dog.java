package Java3_e_Pet_Master;

public class Dog extends Pet {

	@Override
	public void print() {

		System.out.println("������԰�:");
		System.out.println("����һֻ��ʿ��");
		System.out.println(
				"�ҵ����ֽ�" + getName() + ",�ҵĽ���ֵ��" + getHealth() + ",�Һ����˵����ܶ���" + getLove() + ",�ҵ��Ա���:" + getSex());

	}

}
