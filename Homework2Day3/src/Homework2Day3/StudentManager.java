package Homework2Day3;

public class StudentManager {
	public void joinToCourse(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+" joined to" +" "+ student.getCourse());
		
	}
	public void joinToCourseMultiple(Student[] students) {
		for (Student student : students) {
			joinToCourse(student);
			
			
		}
		
	}
	public void attendRollCall(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+" attended roll call"+" "+ student.getCourse());
	}
	public void sendHomework (Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" send homework");
	}

}
