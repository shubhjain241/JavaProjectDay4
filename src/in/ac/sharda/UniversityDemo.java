package in.ac.sharda;

public class UniversityDemo {

	public static void main(String[] args) {
		University u = new University();
		for(int i =1; i<21;i++) {        //Here we adding 20 departments 
			Department d = new Department(i);
			boolean added = u.addDepartment(d);
			if(added) {
				System.out.println("Department added");
				for(int j=1; j<21; j++) {                    //Here we adding 20 students to each department
					d.addStudent(new Student(i,"Name"+i));
				}
			}else {
				System.out.println("Not added");
			}
		}
		u.printDepartment();
		u.resultDeclared();

	}

}
