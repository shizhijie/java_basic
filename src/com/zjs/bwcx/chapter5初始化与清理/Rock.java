package com.zjs.bwcx.chapter5初始化与清理;

public class Rock {
	
	private String s1;
	private String s2 = "initialize";
	
	public Rock() {
		System.out.print("Rock ");
	}
	
	public Rock(int i){
		System.out.print("Rock " + i + " " + s1 + " ");
	}
	
	public Rock(String s1) {
		
		this.s1 = s1;
		System.out.print(s2 + "  ");
		System.out.println();
		System.out.print(s1 + " ");
	}
	
	public static void main(String[] args) {
		/*for (int i = 0; i < 10; i++) {
			new Rock();
		}*/
		/*for (int i = 0; i < 10; i++) {
			new Rock(i);
		}*/
		
		for (int i = 0; i < 10; i++) {
			new Rock("initialize2");
		}
	}
}
