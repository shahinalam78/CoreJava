package com.java.corejava.oop1;

public class CallByValueCallByRef {

	int x = 30;
	int p = 50;
	int q = 70;

	public static void main(String[] args) {

		CallByValueCallByRef obj = new CallByValueCallByRef();

		System.out.println(obj.x);

		obj.test(400); // call by value

		System.out.println(obj.x);

		obj.p = 100;
		obj.q = 200;

		obj.test1(obj); // call by reference

		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public void test(int x) {

		x = x + 100;
	}

	public void test1(CallByValueCallByRef t) {

		int temp;

		temp = t.p;

		t.p = t.q;

		t.q = temp;

	}

}
