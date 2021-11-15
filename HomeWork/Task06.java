package HomeWork;

public class Task06 {

	/*
	 * Write Book class that will have instance variables and 2 Constructors. While
	 * creating an object make sure: Instance variables are being initialized Both
	 * Constructors are being executed
	 */
	
	String name,writtenBy;

	public Task06(String name) {
		this.name = name;
	}

	public Task06(String name, String writtenBy) {
		this(name);
		this.writtenBy = writtenBy;
	}
	public void getInfo() {
		System.out.println("The book " + name+" is written by "+ writtenBy);
	}
	
}
