package javaOdevler;

public class Course {
    	
	//nesne de�i�kenleri 
	int courseId;
	String courseDetail, instructor;
	boolean ucretsiz;
	
	//parametresiz constructor
	public Course () {
		
	}
	
	//parametreli constructor
	public Course (int courseId, String courseDetail, String instructor, boolean ucretsiz ) {
		
		super();// course class �ndaki de�i�kenleri ald�
		
		this.courseId=courseId;
		this.courseDetail=courseDetail;
		this.instructor=instructor;
		this.ucretsiz=ucretsiz;
	}
}
