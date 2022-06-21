package test;

public class TestCheck extends Thread{

	private String name;
	
	public TestCheck(String name) {
		this.name = name;
	}
	
	public void display() {
		for(int i=1;i<=5;i++) {
			System.out.println("val###"+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TestCheck t1= new TestCheck("T1");
		TestCheck t2= new TestCheck("T2");
		t1.start();
		t1.display();
		t1.join();
		t2.start();
		t2.display();
		t2.join();
		
		
	}
	
	

}


