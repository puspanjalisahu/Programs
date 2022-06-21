package Java8;

public class FunctionalTestClass {

	public static void main(String[] args) {
		
		FunctionalTest t =()->{System.out.println("test");};
		t.funFunctional();
		t.testFunctional();
		FunctionalTest.funnyFunctional();

	}

}
