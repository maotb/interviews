package main.java.Chapter_06.Section_2;

class StaticValue{
	public static String test = "abc";
	public static int t = 10;
}


public class Example1{
	public static void main(String[] args) {
		StaticValue st = new StaticValue();
		System.out.println(st.test+"  "+st.t);
		first();
		StaticValue st2 = new StaticValue();
		System.out.println(st2.test+"  "+st2.t);
		
	}
	
	public static void first(){
		StaticValue st = new StaticValue();
		st.test = "def";
		st.t = 20;
	}

}