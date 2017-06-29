package main.java.Chapter_06.Section_1;

/**
 * 6.1 传值与传引用 面试例题2
 * 
 * @author maotb
 *
 */

class Value {
	public int i = 15;
}

public class Example2 {

	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.first();
	}

	public void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i);
	}

	public void second(Value v, int i) {
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);

	}
}
