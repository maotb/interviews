package main.java.Chapter_11.Section_1;

import java.util.Stack;
import java.util.Vector;

public class Example4 {
	
	static String[] months = {"January","February","March","April","May","June","July",
			"August","September","October","November","December"};
	
	public static void main(String[] args){
		vector();
	}
	
	private static void stack(){
		Stack stk = new Stack();
		for (int i = 0; i < months.length; i++) {
			stk.addElement(months[i]);
		}
		
		System.out.println("stk="+stk);
		stk.addElement("The last line");
		while (!stk.empty()) {
			System.out.println(stk.pop());
		}
	}
	
	
	private static void vector(){
		Vector vq = new Vector();
		for (int i = 0; i < months.length; i++) {
			vq.addElement(months[i]);
		}
		
		if(vq.isEmpty()){
			System.out.println("kong");
		}
		
		while(!vq.isEmpty()){
			System.out.println(vq.firstElement());
			vq.removeElement(vq.firstElement());
		}
		
		vq.clear();
	}
}
