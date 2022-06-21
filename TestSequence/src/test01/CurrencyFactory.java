package test01;

public class CurrencyFactory {
	
	public Currency getCountry(String name) {
		Currency currency = null;
		if(name == null || name.isBlank()) {
			return null;
		}
		else {
			if(name.equals("India")) {
				currency = new Indian();
			}else if(name.equals("Singapore")) {
				
			}currency = new Singapore();
		}
	  return currency;
	}
	
	

}
