package javaOdevler;


//iş sınıfı
public class CourseManager {
	
    //methodlar
	public void addToCart(Course course) {
		System.out.println("Kurs sepete eklendi: " + course.courseDetail);
	}
	
	public void deleteFromCart(Course course) {
		System.out.println("Kurs sepetten silindi: " + course.courseDetail);
	}
	
}