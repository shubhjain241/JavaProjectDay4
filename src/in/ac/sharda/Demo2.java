package in.ac.sharda;

public class Demo2 {

	public static void main(String[] args) {
		IResultArrivedListener iral
				= new Student(1,"Shubham");
		iral.resultArrived();
		
		iral = new Department(1);
		
		iral.resultArrived();
		
	
	}

}
