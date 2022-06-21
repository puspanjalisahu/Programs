package Java8;

@FunctionalInterface
public interface FunctionalTest {
	
	public void testFunctional();
	
	public default void funFunctional() {
		System.out.println("funfunctional");
	}

	public static void funnyFunctional() {
		System.out.println("funnyFunctional");
	}

}
