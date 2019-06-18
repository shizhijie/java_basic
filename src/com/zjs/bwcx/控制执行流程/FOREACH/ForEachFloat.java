package com.zjs.bwcx.控制执行流程.FOREACH;

import java.util.Iterator;
import java.util.Random;

import sun.misc.FpUtils;

public class ForEachFloat {
	public static void main(String[] args) {
		Random random = new Random(47);
		float[] f = new float[10];
		for (int i = 0; i < 10; i++) {
			f[i] = random.nextFloat();
		}
		for(float ft:f) {
			System.out.println(ft);
		}
		
		for(char c:"An African Swallow".toCharArray()) {
			System.out.print(c+" ");
		}
		
		for(int i=0;i<1000;i++) {
			if (i<=99)
				System.out.println(i + " ");
			else
				break;
		}
		
		for(int i=0;i<1000;i++) {
			if (i<=99)
				System.out.println(i + " ");
			else
				return;
		}
	}
}
