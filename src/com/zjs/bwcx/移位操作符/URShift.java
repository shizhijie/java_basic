package com.zjs.bwcx.移位操作符;

public class URShift {
	public static void main(String[] args) {
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(String.valueOf(Integer.toBinaryString(i)).length());
		i >>>= 10;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(String.valueOf(Integer.toBinaryString(i)).length());
		long l = -1;
		System.out.println(Long.toBinaryString(l)+"======");
		System.out.println(String.valueOf(Long.toBinaryString(l)).length());
		l >>>= 10;
		System.out.println(Long.toBinaryString(l));
		System.out.println(String.valueOf(Long.toBinaryString(l)).length());
		short s = -1;
		System.out.println(Integer.toBinaryString(s));
		System.out.println(String.valueOf(Integer.toBinaryString(s)).length());
		s >>>= 10;
		System.out.println(Integer.toBinaryString(s));
		System.out.println(String.valueOf(Integer.toBinaryString(s)).length());
		byte b = -1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(String.valueOf(Integer.toBinaryString(b)).length());
		b >>>= 10;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(String.valueOf(Integer.toBinaryString(b)).length());
		b = -1;
		System.out.println(Integer.toBinaryString(b>>>10));
		System.out.println(String.valueOf(Integer.toBinaryString(b>>>10)).length());
	}
}
