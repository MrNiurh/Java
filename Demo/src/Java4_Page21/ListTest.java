package Java4_Page21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ListTest {

	public Map<String, Penguin> penguinToSelect;

	public ListTest() {
		this.penguinToSelect = new HashMap();
	}

	/**
	 * 添加狗的名字和品种
	 * 
	 * @param args
	 */

	public void testAdd() {

		Penguin[] penguins = { new Penguin("欧欧", "Q仔"), new Penguin("亚亚", "Q仔"), new Penguin("菲菲", "Q妹"),
				new Penguin("美美", "Q妹") };

		for (Penguin penguin : penguins) {
			penguinToSelect.put(penguin.name, penguin);
		}

	}

	/**
	 * 使用迭代器 取得List中的元素
	 * 
	 * @param args
	 */

	public void testIterator() {

		System.out.println("使用Iterator遍历,所有的企鹅的昵称和品种分别是:");

		Set<String> keys = penguinToSelect.keySet();
		Iterator it = keys.iterator();

		// 开始输出
		while (it.hasNext()) {
			Penguin penguin = penguinToSelect.get(it.next());
			System.out.println(penguin.name + "\t" + penguin.brand);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest lt = new ListTest();

		lt.testAdd();
		lt.testIterator();

	}

}
