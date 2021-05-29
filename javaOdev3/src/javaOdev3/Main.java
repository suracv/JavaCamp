package javaOdev3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1= new Instructor();
		instructor1.id=1;
		instructor1.firstName="engin";
		instructor1.lastName="demirog";
		instructor1.email="engin@demirog.com";
		instructor1.password="seventh";
		instructor1.courses="Java ile programlamaya giriş";
		
		Student student1= new Student();
		student1.id=2;
		student1.firstName="sura";
		student1.lastName="cavdar";
		student1.email="sura@cavdar.com";
		student1.password="elevenTen";
		student1.takenCourses=instructor1.courses;
		
		
		InstructorManager instructorManager = new InstructorManager();
	    instructorManager.addCourse(instructor1);
	    instructorManager.deleteCourse(instructor1);
	    
	    StudentManager studentManager = new StudentManager();
        studentManager.take(student1);
		
        UserManager userManager = new UserManager();
        userManager.logIn(student1);
        userManager.logOut(student1);
        
		
		

	}

}
