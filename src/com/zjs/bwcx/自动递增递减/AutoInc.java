package com.zjs.bwcx.自动递增递减;

public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("i:" + i);//1
		System.out.println("++i:" + ++i);//pre-increment 2
		System.out.println("i++:" + i++);//post-increment 2
		System.out.println("i:" + i);//3
		System.out.println("--i:" + --i);//pre-decrement 2
		System.out.println("i--:" + i--);//post-decrement 2
		System.out.println("i:" + i);//1
	}
}
