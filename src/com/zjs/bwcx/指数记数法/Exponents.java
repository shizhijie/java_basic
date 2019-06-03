package com.zjs.bwcx.指数记数法;

public class Exponents {
	public static void main(String[] args) {
		//uppercase and lowercase 'e' are the same
		float expFloat = 1.39e-43f;
		expFloat = 1.39e-43F;
		System.out.println(expFloat);
		double expDouble = 47e47d;//'d' is optional
		double expDouble2 = 47e47;//Automatically double
		System.out.println(expDouble);
		System.out.println(expDouble2);
	}
}
