package com.zjs.bwcx.算术操作符;

import java.util.Random;

public class MathOps {
	
	public static void main(String[] args) {
		//Create a seeded random number generator;
		Random random = new Random(47);
		int i,j,k;
		//Choose value from 1 to 100;
		j = random.nextInt(100) + 1;
		System.out.println("j : " + j);
		k = random.nextInt(100) + 1;
		System.out.println("k : " + k);
		i = j + k;
		System.out.println("j + k : " + i);
		i = j - k;
		System.out.println("j - k : " + i);
		i = k / j;
		System.out.println("j / k : " + i);
		i = k * j;
		System.out.println("k * j : " + i);
		i = k % j;
		System.out.println("k % j : " + i);
		j %= k;
		System.out.println("j %= k : " + j);
		//Floating-point number tests
		float u,v,w;// Applies to doubles , too
		v = random.nextFloat();
		System.out.println("v : " + v);
		w = random.nextFloat();
		System.out.println("w : " + w);
		u = v + w;
		System.out.println(" v + w :" + u);
		u = v- w;
		System.out.println(" v - w :" + u);
		u = v * w;
		System.out.println(" v * w :" + u);
		u = v / w;
		System.out.println(" v / w :" + u);
		//the following also works for char 
		//byte short int long and double
		u += v;
		System.out.println("u += v : " + u);
		u -= v;
		System.out.println("u -= v : " + u);
		u *= v;
		System.out.println("u *= v : " + u);
		u /= v;
		System.out.println("u /= v : " + u);
		u %= v;
		System.out.println("u %= v : " + u);
	}
}
