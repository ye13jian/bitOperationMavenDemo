package com.jianye.bitoperation;

/**
 * 位运算基本测试
 * @author jianye
 *
 */
public class BitOperationTest {
	public static void main(String[] args) {
		// 右移
		System.out.println(5 >> 3);
		// 左移
		System.out.println(5 << 3);
		
		// 与
		System.out.println(5 & 3);
		
		// 或
		System.out.println(5|3);
		
		// 非
		System.out.println(~ 5);
		
		// 异或
		System.out.println(5^3);
		
		// 无符号右移
		System.out.println(-5 >>> 1);
	}
}
