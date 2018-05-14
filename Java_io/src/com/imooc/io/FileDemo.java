package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// 了解构造函数情况 alt+/
		File file = new File("E:\\JAVA work space\\Java_io\\hello");
		// System.out.println(file.exists());

		// if (!file.exists()) {
		// file.mkdir();// 创造文件夹
		// } else {
		// file.delete();// 删除文件夹
		// }

		// 是否是一个目录 如果是目录返回true,如果不是目录或目录不存在返回false
		System.out.println(file.isDirectory());
		// 是否是一个文件
		System.out.println(file.isFile());

		// File file2 = new File("E:\\JAVA work space\\Java_io\\日记1.txt");
		File file2 = new File("E:\\JAVA work space\\Java_io", "日记1.txt");
		// if (!file2.exists()) {
		// try {
		// file2.createNewFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// } else {
		// file2.delete();
		// }

		// 常用的File对象的API
		System.out.println(file);// file.toString的内容
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println(file.getParent());
		System.out.println(file2.getParent());
		System.out.println(file.getParentFile().getAbsolutePath());
	}

}
