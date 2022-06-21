package thread;

public class OddEvenPrint {

	int number =1;
	static int max ;
	
	public void printOdd() {
		
		synchronized(this) {
		while(number<max) {
			
			if(number % 2==1) {
				try {
					wait();
				}catch (Exception e) {
					
				}
				System.out.println("Thread name "+Thread.currentThread().getName()+"value-"+number);
				number++;
				notify();
			}
		}
		}
	}
	public void printEven() {
		synchronized(this) {
			while(number<max) {
				if(number % 2==0) {
					try {
						wait();
					}catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println("Thread name "+Thread.currentThread().getName()+"value-"+number);
				number++;
				notify();
			}
		}
	}
	 public static void main(String[] args)
	    {
	        // Given Number N
	        max = 10;
	        
	        OddEvenPrint pp = new OddEvenPrint();
	        Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					pp.printOdd();
					
				}
			});
            Thread t2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					pp.printEven();
					
				}
			});
            
            t1.start();
            t2.start();
	    }
}
