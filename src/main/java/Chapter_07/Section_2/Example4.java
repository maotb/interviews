package main.java.Chapter_07.Section_2;

public class Example4 {
	public static void main(String[] args) {
		prime2();
	}
	
	public static void prime1(){
		int a[], i, j;
		a = new int[101];
		for (i = 1; i < 101; i++) {
			a[i] = 1;
		}

		for (i = 2; i < 101; i++) {
			for (j = i + i; j < 101;) {
				if(j%i==0){
					a[j] = 0;
				}
				j = j+1;
			}
		}

		for (i = 2; i < 101; i++) {
			if (a[i] != 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void prime2(){
		int  i, j,k;
		for(i=1;i<100;i++){
			k =(int)Math.sqrt(i);
			for(j=2;j<=k;j++){
				if(i%j==0){
					break;
				}
			}
			if(j>k){
//				System.out.println("j"+j+" k"+k);
				System.out.println(i);
			}
		}
	}
}
