package in.ac.sharda;

public class Student implements IResultArrivedListener{
	
	private final int rollNumber;
	private final String name;
	private String email;
	
	public Student(int rn,String n) {
		this.rollNumber=rn;
		this.name=n;
	}
	
	public Student(int rn,String n, String email) {
		this.rollNumber=rn;
		this.name=n;
		this.email =email;
	}
	
	
	public void attendance() {
		System.out.println("Present");
	}
	
	public int getRollNumber() {                   //only getter is created as it is private
		return rollNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {                       //only getter is created as it is private
		return name;
	}
	

	
//	public void setRollNumber(int rn) {            //we cannot have setter method for final variables
//		this.rollNumber = rn;
//		}
	
	
	
	//Override
	public boolean equals(Object obj) {                    //taking argument as an external obj
		if(obj instanceof Student) {                     //we are checking if object is instance of student class
			return ((Student)obj)                            //here we are typecasting
					.getRollNumber() == rollNumber;             //boolean equality operator it will return true or false 
		}
		
		return false;
	}

@Override
public void resultArrived() {
	System.out.println("Hey result is out!!- Go check it out" +name);	
}




	
}
