package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Shubham");
		Student s2 = new Student(2,"shubham", "shubhjain241@gmail.com");
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getName());
		s1.setEmail("abc");
		System.out.println(s1.getEmail());
		System.out.println(s2.getRollNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
		
		System.out.println(s1.equals(s2));        //here we are checking roll no. is same or not
	}

}
