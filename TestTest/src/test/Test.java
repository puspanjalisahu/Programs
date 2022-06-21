package test;


class ThreadPrint implements Runnable{
	
	int num =1;
	int max = 10;
	int rem ;
	private String name;
	
	public ThreadPrint(String name,int rem) {
		this.name = name;
		this. rem = rem;
	}

	@Override
	public void run() {
		
		while (num < max) {
			if(num % 2== rem) {
				System.out.println(Thread.currentThread().getName());
			}
			num++;
		}
		
		
	}
	
}

public class Test {

	public static void main(String[] args) {
		Thread odd = new Thread(new ThreadPrint("odd", 1));
		Thread even = new Thread(new ThreadPrint("even", 0));
        odd.start();
        even.start();
	}

}

