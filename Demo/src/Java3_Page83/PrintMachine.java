package Java3_Page83;

public class PrintMachine implements InkBox, Paper {

	public void print() {// 定义方法

		for (String ib : inkBox) {// 遍历输出打印方式

			for (String p : paper) {

				System.out.println("使用" + ib + "在" + p + "纸张上打印");
			}
		}

	}

}
