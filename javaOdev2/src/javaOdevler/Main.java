package javaOdevler;

public class Main {

	public static void main(String[] args) {
        //parametreli
		Course course1 = new Course(1, "JAVA", "Engin Demiroğ",true);
		Course course2= new Course (2,"C#","Engin Demiroğ",true );
		
		//parametresiz
		Course course3=new Course();
		course3.courseId=3;
		course3.courseDetail="PYTHON#";
		course3.instructor="Engin Demiroğ";
		course3.ucretsiz=true;
		
		Course course4=new Course();
		course4.courseId=4;
		course4.courseDetail="PHP";
		course4.instructor="Engin Demiroğ";
		course4.ucretsiz=true;
		
		
		Course[] course = { course1, course2, course3, course4 };
		
		for(Course kurs: course) {
			System.out.println(kurs.courseDetail+" "+ " "+ kurs.instructor);
		}
				
		System.out.println("eğitmenin "+ course.length+" adet kursu vardır.");
				
		CourseManager courseManager = new CourseManager();
		
		courseManager.addToCart(course1); 
		
		courseManager.deleteFromCart(course2);
		
		

    }

}