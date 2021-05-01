package Homework2Day3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" "+ user.getEmail()+ " added to system ");
			
	}
	public void addMultiple(User[]users) {
		for (User user : users) {
			add(user);
			
		}
		
	}
	public void remove (User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+user.getEmail()+ " has been removed ");
		
	}
	public void removeMultiple(User[]users) {
		for (User user : users) {
			remove(user);
			
		}
	}
	

}
