package Java4_Page10;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public List penguinToSelect;

	public ListTest() {
		this.penguinToSelect = new ArrayList();

	}

	/**
	 * 添加企鹅
	 */
	Penguin ououPenguin = new Penguin("欧欧", "Q仔");
	Penguin yayaPenguin = new Penguin("亚亚", "Q妹");
	Penguin feifeiPenguin = new Penguin("菲菲", "Q妹");
	Penguin meimeiPenguin = new Penguin("美美", "Q妹");

	public void testAdd() {

		penguinToSelect.add(ououPenguin);
		penguinToSelect.add(yayaPenguin);
		penguinToSelect.add(feifeiPenguin);
		penguinToSelect.add(meimeiPenguin);

		System.out.println("共计有" + penguinToSelect.size() + "只企鹅");
	}

	/**
	 * 删除企鹅
	 */

	public void testRemove() {

		penguinToSelect.remove(2);
		penguinToSelect.remove(2);// 当然不一样

		System.out.println("\n删除后还有" + penguinToSelect.size() + "只企鹅");
	}

	public void testContains() {

		if (!penguinToSelect.contains(meimeiPenguin)) {
			System.out.println("\n集合中没有美美的信息");
		}
	}

	/**
	 * 获取列表中的信息
	 */

	public void testGet() {

		System.out.println("分别是:");

		for (Object obj : penguinToSelect) {

			Penguin penguin = (Penguin) obj;
			System.out.println(penguin.name + "\t" + penguin.sex);

		}

	}

	public static void main(String[] args) {

		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testRemove();
		lt.testGet();
		lt.testContains();
		
		

	}

}
