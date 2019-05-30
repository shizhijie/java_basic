package com.zjs.bwcx.别名机制;

public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.numInt = 9;
		t2.numInt = 47;
		t1.numFloat = 9;
		t2.numFloat = 47;
		System.out.println("t1.numInt:"+t1.numInt+",t2.numInt:"+t2.numInt);
		System.out.println("t1.numFloat:"+t1.numFloat+",t2.numFloat:"+t2.numFloat);
		t1 = t2;
		System.out.println("t1.numInt:"+t1.numInt+",t2.numInt:"+t2.numInt);
		System.out.println("t1.numFloat:"+t1.numFloat+",t2.numFloat:"+t2.numFloat);
		t1.numInt = 27;
		t1.numFloat = 27;
		System.out.println("t1.numInt:"+t1.numInt+",t2.numInt:"+t2.numInt);
		System.out.println("t1.numFloat:"+t1.numFloat+",t2.numFloat:"+t2.numFloat);
	}
}
