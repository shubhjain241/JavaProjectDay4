package in.ac.sharda;


public class DepartmentDemo {

	public static void main(String[] args) {
		Department d = new Department(12);
//		d.addStudent(new Student(1,"Shubham"));
//		d.addStudent(new Student(2,"shubham"));
		for (int i=0;i<26;i++) {
			d.addStudent(new Student(i,"Shubham"+i));   //there is flaw in this program
		}
		d.printStudent();
		
	}

}
