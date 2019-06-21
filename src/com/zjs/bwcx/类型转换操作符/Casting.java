package com.zjs.bwcx.类型转换操作符;

public class Casting {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = 200;
		long lng = (long)i;
		long lng2 = (long)200;
		lng2 = 200;
		System.out.println(getType(lng2));
		i = (int) lng2;
	}
	static String getType(Object o) {
		return o.getClass().getTypeName();
	}
}
