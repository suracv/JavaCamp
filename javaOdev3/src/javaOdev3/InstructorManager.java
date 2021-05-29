package javaOdev3;

public class InstructorManager {
	
public void addCourse(Instructor instructor) {
	System.out.println( instructor.getFirstName() +" "+ instructor.courses + " "+ "added this course");
	
}
public void deleteCourse(Instructor instructor) {
	System.out.println( instructor.getFirstName() +" "+ instructor.courses + " "+ "deleted this course");
	
}
}
