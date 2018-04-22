package Java4_Page12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static LinkedList dogToSelect;

	public LinkedListTest() {
		this.dogToSelect = new LinkedList();
	}

	Dog ououdog = new Dog("欧欧");
	Dog yayadog = new Dog("亚亚");
	Dog feifeidog = new Dog("菲菲");
	Dog meimeidog = new Dog("美美");

	/**
	 * 添加狗的名字
	 * 
	 * @param args
	 */

	public void testAdd() {

		dogToSelect.add(ououdog);
		dogToSelect.add(yayadog);
		dogToSelect.add(feifeidog);
		dogToSelect.add(meimeidog);
	}

	public void get() {

		for (Object obj : dogToSelect) {

			Dog dog = (Dog) obj;
			System.out.println(dog.name);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTest llt = new LinkedListTest();
		llt.testAdd();
		System.out.println("所有:");
		llt.get();
		System.out.println("\n***************************");
		Dog firstDog = (Dog) dogToSelect.getFirst();
		System.out.println("\n第一条狗狗的昵称是:" + firstDog.name);
		Dog lastDog = (Dog) dogToSelect.getLast();
		System.out.println("最后一条狗狗的昵称是:" + lastDog.name);

		dogToSelect.removeFirst();
		dogToSelect.removeLast();
		System.out.println("\n***************************");
		System.out.println("\n删除后:");
		llt.get();

	}

}
