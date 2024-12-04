//this class will contain all the HashMap of all UserID and Password combinations

package idandpasswords;

import java.util.HashMap;

public class IDandPasswords {
	
	//STEP 1. Let's create a HashMap for our IDs and Passwords
	
	HashMap<String,String> loginInfo = new HashMap<String,String>();
	
	//STEP 2. Let's create a constructor for our class
	
	public IDandPasswords(){
		//In order to put some Keys and Values within our HashMap, we must use the name of the object and the put() method/function
		
		loginInfo.put("gaesigua", "abcd1234");
		loginInfo.put("tin", "abc123");
		loginInfo.put("gasigwa", "12345abcdef");
		loginInfo.put("okay", "aabbcc112233");
		
	//STEP 3. After creating the constructor, and adding a few keys and values to the HashMap, we want to send this HashMap or constructor
		      //to any class that requests it. In order to do that, we must create a getter method for this HashMap
	}
	
	//STEP 5. NOW since we are adding a return to our getter method, we must specify/tell that to the getter method by adding HashMap
	
	//STEP 6. NOW let's give our getter method a privacy status of protected so that not just anybody can call this method since this class contains user IDs and Passwords
	 protected HashMap getLoginInfo(){
		 
		 //STEP 4. After creating our getter method, we want to make sure the getter method returns our HashMap, so we add a return 
		 
		return loginInfo;
	}
	


}
