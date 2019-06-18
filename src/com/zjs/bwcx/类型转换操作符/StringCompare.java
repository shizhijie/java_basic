package com.zjs.bwcx.类型转换操作符;

public class StringCompare {
	public static void main(String[] args) {
		compare("a","b");
		compare("a","a");
	}

	private static void compare(String s1, String s2) {
		System.out.println(s1==s2);
		System.out.println(s1!=s2);
		System.out.println(s1.equals(s2));
		for (; ;) {
			System.out.println(21);
		}
	}
}
