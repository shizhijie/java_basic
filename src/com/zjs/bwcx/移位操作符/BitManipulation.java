package com.zjs.bwcx.移位操作符;

import java.util.Random;

public class BitManipulation {
	public static void main(String[] args) {
		Random random = new Random(47);
		int i = random.nextInt();
		int j = random.nextInt();
		System.out.printf("i:%d,j:%d", i,j);
		System.out.println();
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(+1));
		int maxpos = 2147483647;
		System.out.println(Integer.toBinaryString(maxpos));
		int maxneg = -2147483647;
		System.out.println(Integer.toBinaryString(maxneg));
		System.out.println("i:"+Integer.toBinaryString(i));
		System.out.println("~i:"+Integer.toBinaryString(~i));
		System.out.println("-i:"+Integer.toBinaryString(-i));
		System.out.println("j:"+Integer.toBinaryString(j));
		System.out.println("i&j:"+Integer.toBinaryString(i&j));
		System.out.println("i|j:"+Integer.toBinaryString(i|j));
		System.out.println("i^j:"+Integer.toBinaryString(i^j));
		System.out.println("i<<5:"+Integer.toBinaryString(i<<5));
		System.out.println("i>>5:"+Integer.toBinaryString(i>>5));
		System.out.println("(~i)>>5:"+Integer.toBinaryString((~i)>>5));
		System.out.println("i>>>5:"+Integer.toBinaryString(i>>>5));
		System.out.println("(~i)>>>5:"+Integer.toBinaryString((~i)>>>5));
		
		long l = random.nextLong();
		long m = random.nextLong();
		System.out.printf("l:%d,m:%d", i,m);
		System.out.println();
		System.out.println(Long.toBinaryString(-1L));
		System.out.println(Long.toBinaryString(+1L));
		Long ll = 9223372036854775807L;
		System.out.println(Long.toBinaryString(ll));
		Long lln = -9223372036854775808L;
		System.out.println(Long.toBinaryString(lln));
		System.out.println("l:"+Long.toBinaryString(l));
		System.out.println("~l:"+Long.toBinaryString(~l));
		System.out.println("-l:"+Long.toBinaryString(-l));
		System.out.println("m:"+Long.toBinaryString(m));
		System.out.println("l&m:"+Long.toBinaryString(l&m));
		System.out.println("l|m:"+Long.toBinaryString(l|m));
		System.out.println("l^m:"+Long.toBinaryString(l^m));
		System.out.println("l<<5:"+Long.toBinaryString(l<<5));
		System.out.println("l>>5:"+Long.toBinaryString(l>>5));
		System.out.println("(~l)>>5:"+Long.toBinaryString((~l)>>5));
		System.out.println("l>>>5:"+Long.toBinaryString(l>>>5));
		System.out.println("(~l)>>>5:"+Long.toBinaryString((~l)>>>5));
	}
}
