package lngJava;


public class MainClass {

	public static void main(String args[]) {
		
		
		Dog doggo = new Dog(8, "Pug", true);
		
		System.out.println(doggo.breed);
		System.out.println(doggo.isMale);
		
		doggo.setBreed("German");
		
		System.out.println(doggo.breed);
		
		int dogAge = doggo.getAge();
		
		System.out.println(dogAge);
		
		doggo.bark();

		
	}
	
}
