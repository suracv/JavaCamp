package javaOdev3;

public class UserManager {

	public void logIn(User user) {
	System.out.println(user.getFirstName() + " logged into the system ");
	}
	
	public void logOut(User user){
		System.out.println(user.getFirstName() + " logged out of the system ");

	}	
}
