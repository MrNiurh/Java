package Java4_Page5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

	public List dogToSelect;

	public ListTest() {
		this.dogToSelect = new ArrayList();
	}

	/**
	 * 添加狗的名字和品种
	 * 
	 * @param args
	 */

	public void testAdd() {

		Dog[] dogs = { new Dog("欧欧", "雪纳瑞"), new Dog("亚亚", "拉布拉多"), new Dog("菲菲", "拉布拉多"), new Dog("美美", "雪纳瑞") };

		dogToSelect.addAll(Arrays.asList(dogs));
	}

	/**
	 * 取得List中的元素
	 * 
	 * @param args
	 */

	public void testGet() {

		System.out.println("共计有:" + dogToSelect.size() + "条狗狗");

		System.out.println("分别是:");
		for (Object obj : dogToSelect) {

			Dog dog = (Dog) obj;
			System.out.println(dog.name + "\t" + dog.brand);
		}
	}

	/**
	 * 删除元素
	 */

	public void testRemove() {

		dogToSelect.remove(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest lt = new ListTest();

		lt.testAdd();
		lt.testGet();
		lt.testRemove();
		lt.testGet();

	}

}
