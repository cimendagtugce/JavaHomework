package Homework2Day3;

public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCourse()+" added by"+" "+ instructor.getFirstName()+" "+ instructor.getLastName());
		
	}
	public void removeCourse(Instructor instructor) {
		System.out.println(instructor.getCourse()+" removed by"+" "+ instructor.getFirstName()+" "+ instructor.getLastName());
		
	}
	public void addHomework(Instructor instructor) {
		System.out.println("Homework added by"+" "+ instructor.getFirstName()+" "+ instructor.getLastName());
		
	}

}
