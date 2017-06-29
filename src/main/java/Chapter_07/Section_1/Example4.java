package main.java.Chapter_07.Section_1;

public class Example4 {
	public static void main(String[] args) {
		String s = "122";
		Pailie(s,"");
	}
	
	static void Pailie(String s,String p){
		if(s.length()<1){
			System.out.println(p);
		}else{
			int index[] = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {
				index[i] = s.indexOf(s.charAt(i));
			}
			for (int i = 0; i < s.length(); i++) {
				if(i == index[i]){	//只有当循环数与第一次记录数相等时才递归，保证相同字符中的第一个调用
					Pailie(s.substring(1), p+s.substring(0, 1)); //递归，打印其他字符串
				}
				s = s.substring(1)+s.substring(0,1);	//循环移位
			}
		}
		
		
	}
}
