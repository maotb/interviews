package main.java.Chapter_12.Section_1;

public class Example4 {
	
	public static void main(String[] args) {
		String str = "123B中国A我";
		new Example4().A(str,9);
	}
	
	public void A(String str,int i){
		byte b[] = new byte[64];
		int num = 0;
		b = str.getBytes();
		
		if(b[i-1]>0){
			System.out.println(new String(b,0,i));
		}else{
			for (int j = 0; j < i; j++) {
				if(b[j]<0){
					num++;
					num = num%3;
				}else{
					num =0;
				}
			}
			
			if(num==0){
				System.out.println(new String(b,0,i));
			}else{
				System.out.println(new String(b,0,i-num));
			}
			
		}
	}
	
}
