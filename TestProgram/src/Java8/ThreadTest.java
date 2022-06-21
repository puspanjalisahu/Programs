package Java8;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new Thread(()->System.out.println("thread started")).start();
	}

}
