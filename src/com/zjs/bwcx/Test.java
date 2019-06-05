package com.zjs.bwcx;

public class Test {
	
	static int j = 0;
	
	public static boolean methodB(int k) {
		j+=k;
		return true;
	}
	
	public static void methodA(int i) {
		boolean b;
		b = i<10|methodB(7);
		b = i<10||methodB(6);
	}
	public static void main(String[] args) {
		methodA(0);
		System.out.println(j);
	}
}
