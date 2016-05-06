package com.jianye.bitoperation;

/**
 * 位运算基本测试
 * @author jianye
 *
 */
public class BitOperationTest3 {
	public static void main(String[] args) {
		// 取反
		// 1111 1111 1111 1111 1111 1111 1111 1111
		System.out.println(Integer.toBinaryString(-5));
		System.out.println(~-5);
		System.out.println(Integer.toBinaryString(4));
		System.out.println(Integer.SIZE);
		System.out.println("11111111111111111111111111111011".length());
		System.out.println(Integer.toString(-5, 4));
	}
}
