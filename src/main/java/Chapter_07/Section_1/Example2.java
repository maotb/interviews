package main.java.Chapter_07.Section_1;

public class Example2 {
	public static void main(String[] args) {
		System.out.println(fn(7));
	}
	
	public static int fn(int i){
		if(i == 1||i==2 ){
			return 1;
		}
		return fn(i-1)+fn(i-2);
	}
}
