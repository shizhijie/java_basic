package com.zjs.bwcx.枚举;

public class EnumOrder {
	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s + ", ordinal " + s.ordinal());
		}
	}
}
