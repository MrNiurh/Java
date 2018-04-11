package Java3_Page108;

public class Age {

	private int age;

	public int getAge() {

		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 1 || age > 100)// 判断及抛出异常
			throw new Exception("年龄必须在1-100之间");
		this.age = age;
		System.out.println("输入的年龄是" + age);
	}

}
