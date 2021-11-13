package lngJava;

public class Dog {

	int age;
	String breed;
	boolean isMale;
	
	public Dog(int inputAge, String inputBreed, boolean inputIsMale){
		this.age=inputAge;
		this.breed=inputBreed;
		this.isMale=inputIsMale;
	}
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public void setBreed(String newBreed) {
		this.breed=newBreed;
	}
	
	public int getAge() {
		return this.age;
	}
}
