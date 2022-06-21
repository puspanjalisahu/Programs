package EnumTest;
enum Fruits{
	
	APPLE("apple"),ORANGE("orange"),MANGO("mango");
	
	private String name ;
	
	Fruits(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
public class EnumExample {
	
	public static void main(String arg[]) {
		
		System.out.println("enum values "+findFruit("MANGO"));
	}

	private static Fruits findFruit(String fruitName) {
		if(fruitName == null || fruitName.trim().isEmpty()) {
			return null;
		}
		System.out.println("Value of " +Fruits.valueOf(fruitName));
		Fruits[] fruits = Fruits.values();
		for(Fruits fruit :fruits) {
			if(fruitName.equalsIgnoreCase(fruit.getName())){
				return fruit;
			}
		}
		return null;
	}
	

}
