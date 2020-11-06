package Emailapp;
import java.util.Scanner;
public class Email {
	private String firstName; 
	private String lastName;
	private String password; 
	private String department;
	private String email;
	private int mailboxCapacity = 1;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "abc.com";
	
	//Constructor to receive the first name and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		// Call a method asking for the department  - return the department 
		this.department = setDepartment();
	
		
		// Call a method that return a random password 
		this.password = randomPassword(8);
		System.out.println("Email password is: " + this.password);
		
		// Combine elements to generate email 
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
		
	}
	//Ask for department
	
	private String setDepartment() {
		System.out.println("New employee:" + firstName +" .DEPARTMENT CODES\n1 for Marketing \n2 for Information Technology \n3 for Finance\n0 for none\nEnter the department");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1 ) { return "Marketing"; }
		else if (depChoice == 2) { return "Information Technology"; }
		else if (depChoice == 3){ return "Finance"; }
		else {return "";}
				
	}
	
	//Randomly generate password 
	private String randomPassword(int length) {
		String passwordSet = "ABCEFGHIJKLMNOPSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i=0; i<length; i ++) {
			int rand = (int) (Math.random() * passwordSet.length()); 
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);
		
		
	}
	
	// Set the mailbox capacity 
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email 
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail; 
	}
	
	// Change the password 
	public void changePassword(String password) {
		this.password = password; 
	}
	
	public int getMailboxCapacity() {return mailboxCapacity; }
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "EMPLOYEE NAME: " + firstName + "" + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "GB" ;  
	}
	
}


	

