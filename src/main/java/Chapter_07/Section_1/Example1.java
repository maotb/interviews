package main.java.Chapter_07.Section_1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		String[] arry = {"1","2","3"};
		listAll(Arrays.asList(arry), "");
	}
	
	public static void listAll(List candidate,String prefix){
		if(candidate.isEmpty()){
			System.out.println(prefix);
		}
		for (int i = 0; i < candidate.size(); i++) {
			List temp = new LinkedList(candidate);
			listAll(temp, prefix + temp.remove(i));
		}
	}
}
