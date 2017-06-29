package main.java;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) throws Exception {
		SortedSet<Integer> set = new TreeSet<Integer>();
		
		
		set.add(8);
		set.add(1);
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		Class<Test> test = (Class<Test>) Class.forName("main.java.Test");
		
		System.out.println(Class.forName("main.java.Test"));
	}

}