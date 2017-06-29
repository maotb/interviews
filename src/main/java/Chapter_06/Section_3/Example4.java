package main.java.Chapter_06.Section_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputData{	//定义从键盘输入数据的类
	static private String s = "";
	static public void input(){	//从键盘输入一行字符，保存到字符串s中
		BufferedReader bu = new BufferedReader(
			new InputStreamReader(System.in)
		);
		
		try {
			s = bu.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static public int getInt(){
		input();
		return Integer.parseInt(s);	//将字符组成的字符串s转换为整型数据后返回
	}
}


public class Example4 {
	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		print(InputData.getInt());
	}
	
	static void print(int d){
		System.out.println(d+"的平方："+d*d);
	}
}
