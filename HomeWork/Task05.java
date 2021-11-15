package HomeWork;

public class Task05 {
	/*
	 * Write a Student class that have instance variables name and address. Create a
	 * constructor that will initialize those variables. Print name & address of
	 * given student using displayInfo method.
	 */
	String name,address;

	public Task05(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("Name of the student is: " + name + " address of the student is: "+address);
	}
	

}
