package Java3_bank.com;

public class Account {

	double money = 0;

	public void saveMoney(double add) {

		money += add;// 存款操作

		System.out.println("存款成功");
		System.out.println();
		System.out.println("***当前余额为:" + money + "元***");

	}

	public void takeMoney(double del) {

		if (money >= del) {// 取款操作
			money -= del;
			System.out.println("取款成功");
			System.out.println();
			System.out.println("***当前余额为:" + money + "元***");
		}

		else// 余额不足
			System.out.println("余额不足!");

	}

}
