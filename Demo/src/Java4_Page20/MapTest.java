package Java4_Page20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String, Pet> petMap;

	public MapTest() {

		this.petMap = new HashMap<String, Pet>();

	}

	public void testAdd() {

		Pet[] pets = { new Pet("欧欧", "雪纳瑞"), new Pet("亚亚", "拉布拉多"), new Pet("菲菲", "拉布拉多"), new Pet("美美", "雪纳瑞") };
		// 存入Map
		for (Pet pet : pets) {
			petMap.put(pet.name, pet);
		}
	}

	public void testKeySet() {

		Scanner input = new Scanner(System.in);
		// 提示输入
		System.out.print("请输入您要寻找的宠物昵称:");
		String petName = input.next();
		Set<String> keySet = petMap.keySet();

		for (String string : keySet) {

			if (string.equals(petName)) {
				Pet pet = petMap.get(petName);
				System.out.println("\n已找到宠物" + pet.name + "\t" + pet.brand);
			} else {
				System.out.println("不存在该宠物!");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testAdd();
		mt.testKeySet();

	}

}
