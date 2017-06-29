package main.java.Chapter_07.Section_2;

public class Example2 {
	public static void main(String[] args) {
		int n = 2;
		int res = 1;
		while ((getOnly(n) + res) != n) {
			res += getOnly(n);
//			System.out.println("n:"+n+" res:"+res);
			++n;
		}
		System.out.println(n);
	}

	static int getOnly(int num) {
		int number = 0;
		String s = num + "";
		int len = s.length();
		if (len != 0) {
			for (int i = 0; i < len; i++) {
				char a = s.charAt(i);
				if (a == '1') {
					number++;
				}
			}
		}
		return number;
	}
}
