package com.imooc.io;

import java.io.UnsupportedEncodingException;

public class Encode {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "慕课ABC";
		byte[] bytes1 = s.getBytes();// 转换成字节序列用的是项目默认的编码(utf-8)

		for (byte b : bytes1) {
			// 把字节(转换成了int)以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		byte[] bytes2 = s.getBytes("utf-8");
		// utf-8编码中文占用3个字节,英文占用1个字节
		for (byte b : bytes2) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		byte[] bytes3 = s.getBytes("gbk");
		// gbk编码中文占用2个字节,英文占用1个字节
		for (byte b : bytes3) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		// java是双字节编码 utf-16be
		byte[] bytes4 = s.getBytes("utf-16be");
		// utf-16be中文占用2个字节,英文占用2个字节
		for (byte b : bytes4) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();

		/**
		 * 当你的字节序列是某种编码时,想把字节序列变成字符串 也需要用这种编码方式,否则会出现乱码
		 */

		String str1 = new String(bytes4);// 用项目默认的编码
		System.out.println(str1);
		String str2 = new String(bytes4, "utf-16be");
		System.out.println(str2);

		/*
		 * 文本文件 就是字节序列 可以使任意编码的字节序列
		 * 如果在中文机器上直接创建文本文件,那么该文本文件只认识ansi编码
		 */

	}

}
