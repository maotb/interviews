package main.java.Chapter_14.Section_3;

public class Example10 {
	volatile static int test1 = 0;
	public static void main(String[] args) {
		Thread t1 = new TestThread("test1");
		Thread t2 = new TestThread("test2");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println(Example10.test1);
	}
}


class TestThread extends Thread{
	public TestThread(String n){
		super(n);
	}
	
	public void run(){
		synchronized (Example10.class) {
			for (int i = 0; i < 10000000; i++) {
				int oldV = Example10.test1;
				Example10.test1 ++;
				int newV = Example10.test1;
				if(newV - oldV >1 ){
					System.out.println("found");
				}
			}
		}
		System.out.println(this.getName() + " thread end " +Example10.test1);
	}
	
}

