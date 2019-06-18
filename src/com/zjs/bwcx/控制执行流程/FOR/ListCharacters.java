package com.zjs.bwcx.控制执行流程.FOR;

public class ListCharacters {
	public static void main(String[] args) {
		for (char c = 0; c < 128; c++) {
			if (Character.isLowerCase(c)) {
				System.out.println("value: "+(int)c+" character: "+c);
			} 
			if (Character.isUpperCase(c)) {
				System.out.println("value: "+(int)c+" character: "+c);
			}
		}
	}
}
