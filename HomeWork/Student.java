package HomeWork;

public class Student {
	/*
	 * Write a java Class Students that have a constructor which takes students name
	 * and 3 subject grades. Inside your class also have a method to Calculate
	 * Average Grade. Test Student class for 5 different students with different
	 * marks. Your program should print an average mark of each students name. NOTE:
	 * please use different names for instance and local variables.
	 */
	String name; double a,b,c;


	public Student(String name, double a, double b, double c) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		
		
			
		}
	
	public void getAvgGrade (){
		System.out.println((a+b+c)/3);
	
	
}
}
