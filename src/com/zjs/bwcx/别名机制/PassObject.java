package com.zjs.bwcx.别名机制;

public class PassObject {
	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.c = 'a';
		System.out.println("1:tank.c:"+tank.c);
		f(tank);
		System.out.println("2:tank.c:"+tank.c);
	}

	static void f(Tank tank) {
		tank.c = 'y';
	}
}
