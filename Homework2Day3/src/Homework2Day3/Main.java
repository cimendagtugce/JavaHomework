package Homework2Day3;

public class Main {

	public static void main(String[] args) {
	 
		Student student1=new Student();
		student1.setFirstName("Tu��e");
		student1.setLastName("�imenda�");
		student1.setCourse("Java+React Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
		student1.setEmail("student@gmail.com");
		student1.setStudentNumber("123");

		
		Student student2=new Student();
		student2.setFirstName("Ay�a");
		student2.setLastName("�imenda�");
		student2.setCourse("Java+React Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
		student2.setEmail("student2@gmail.com");
		student2.setStudentNumber("456");
	
		
		Student[] students=new Student[] {student1,student2};
		
		Instructor instructor= new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setCourse("Java+React Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
		instructor.setInstructorNumber("789");
		
		Instructor[] instructors =new Instructor[] {instructor};		
		
		UserManager userManager=new UserManager();
		User [] users= {student1,student2,instructor};
		userManager.addMultiple(users);
		userManager.remove(student1);
		userManager.remove(student2);
		
		StudentManager studentManager=new StudentManager();
		studentManager.attendRollCall(student1);
		studentManager.attendRollCall(student2);
		studentManager.joinToCourseMultiple(students);
		studentManager.sendHomework(student1);
		studentManager.sendHomework(student2);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.addHomework(instructor);
		instructorManager.addCourse(instructor);
		instructorManager.removeCourse(instructor);
		
		
		
		
		
		
		
	}

}
