package HomeWork;

public class StridentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Student student1=new Student("John", 
				80,95,85);
		Student student2=new Student("Amy", 
				95,90,100);
		Student student3=new Student("David", 
				90,95,100);
		Student student4=new Student("Tylor", 
				100,85,95);
		Student student5=new Student("Linda", 
				95,100,85);
		
		student1.getAvgGrade();
		student2.getAvgGrade();
		student3.getAvgGrade();
		student4.getAvgGrade();
		student5.getAvgGrade();

	}

}
