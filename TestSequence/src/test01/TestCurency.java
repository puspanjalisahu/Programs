package test01;

public class TestCurency {

	public static void main(String[] args) {
		
       Currency cc = new CurrencyFactory().getCountry("Singapore");
       System.out.println("currency"+cc.display());
		
	}

}
