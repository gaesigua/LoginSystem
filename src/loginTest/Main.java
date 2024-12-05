package loginTest;

import page.LoginPage;

public class Main {

	public static void main(String[] args) {
		
		//Now that we have created the HashMap to store the IDs and Passwords in the IDandPasswords class
		
		//STEP 7. Let's create an instance/Object, for our LoginPage;
		
		//Usually if the classes were in the same package, we would just create a simple instance just like this:
		
		// LoginPage loginPage = new LoginPage(); 
		
		//but since both classes belong to different packages, the instance we made above would not work;
		
		//So let's use another method.
		
		//STEP 8. Let's import the class
		//STEP 9. Let's create an instance and see if it works since we have imported it
		
		//STEP 10. Let's call the getLoginInfo class to access the IDs and Passwords
		
		IDandPasswords.getLoginInfo();
		
		
		LoginPage loginPage = new LoginPage();
		
		
		
		
		
		
		

	}

}
