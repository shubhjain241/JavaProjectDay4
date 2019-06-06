package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department>, IResultArrivedListener {
	
	private final int id;
		
	private List<Student> students = new  ArrayList<>();
	
	public Department(int id) {
		this.id=id;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	
	public int getId() {          //getter method for id
		return id;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Department) {
			return ((Department)o)
					.getId() == id;
		}
		
		return false;
	}

	public void printStudent() {
		students.parallelStream()
		.forEach(
				s -> System.out.println(
						s.getRollNumber()));
//		for(Student s : students) {
//			System.out.println(s.getRollNumber());
//		}
	
	}
	
	
	
	public int compareTo(Department o){    //
		return o.getId() -id;              //if diff is 0 then they are same if diff is -ve then ascending otherwise descending
		
	}

	@Override
	public void resultArrived() {
		//parallelstream - using all CPU cores
		students.parallelStream().forEach(s -> s.resultArrived());
		
		
		//sequential operation- using single cCPU cores
//			for(Student s : students){
//			s.resultArrived();
//		}
	
	}
	

}
