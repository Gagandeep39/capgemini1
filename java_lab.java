// 2.1 Write a java program to print person details in the format as shown below: 

public class PersonDetails {

	public static void main(String[] args) {
		System.out.println("Person Details: ");
		System.out.println("_______________\n");
		System.out.println("First Name: Divya");
		System.out.println("Last Name: Bharathi");
		System.out.println("Gender: F");
		System.out.println("Age: 20");
		System.out.println("Weight: 85.55");

	}

}

//2.2 Write a program to accept a number from user as a command line argument and check whether the given number is positive or negative number. 
public class CmmdLine {

	public static void main(String[] args) {
		if(Integer.parseInt(args[0])>=0)
			System.out.println("Positive");
		else
			System.out.println("Negative");

	}

}

// 2.3 Refer the class diagram given below and createa personclass.

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String firstName, String lastName, char gender) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void displayDetails() {
		System.out.println("Person Details: ");
		System.out.println("_______________\n");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gender: " + gender);
	//	System.out.println("Age: " + ag);
	//	System.out.println("Weight: 85.55");
	}
	
	
	}
	

	public class PersonMain {

		public static void main(String[] args) {
			Person p = new Person("Gagandeep", "Singh", 'M');
			p.displayDetails();
	
		}
	
	}

	// 2.4: Modify Lab assignment 2.3 to accept phone number of a person. Create a newmethod to implement the same and also define method for displaying persondetails.  

	
	import java.util.Scanner;

	public class Person2 {
	private String firstName;
	private String lastName;
	private char gender;
	private String phoneNumberString;
	
	public Person2() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Person2(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumberString = "000000000";
	}
	
	
	public String getPhoneNumberString() {
		return phoneNumberString;
	}
	
	public void enterPhoneNumber() {
		Scanner scanner = new Scanner(System.in);
		phoneNumberString = scanner.next();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void displayDetails() {
		System.out.println("Person Details: ");
		System.out.println("_______________\n");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gender: " + gender);
		System.out.println("Phone: " + phoneNumberString);
	//	System.out.println("Age: " + ag);
	//	System.out.println("Weight: 85.55");
	}
	
	
	}
	
	

	public class PersonMain {

		public static void main(String[] args) {
			Person2 p2 = new Person2("Gagandeep", "Singh", 'M');
			p2.enterPhoneNumber();
			p2.displayDetails();
	
		}
	
	}
		
	// 2.5 Modify the above program, to accept only ‘M’ or ‘F’ as gender field values. Use Enumeration for implementing the same

	import java.util.Scanner;

public class Person3 {
private String firstName;
private String lastName;
private Gender gender;
private String phoneNumberString;

public Person3() {
	// TODO Auto-generated constructor stub
}





public Person3(String firstName, String lastName, Gender gender) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.phoneNumberString = "000000000";
}


public String getPhoneNumberString() {
	return phoneNumberString;
}

public void enterPhoneNumber() {
	Scanner scanner = new Scanner(System.in);
	phoneNumberString = scanner.next();
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public void displayDetails() {
	System.out.println("Person Details: ");
	System.out.println("_______________\n");
	System.out.println("First Name: " + firstName);
	System.out.println("Last Name: " + lastName);
	System.out.println("Gender: " + gender);
	System.out.println("Phone: " + phoneNumberString);
//	System.out.println("Age: " + ag);
//	System.out.println("Weight: 85.55");
}


}

enum Gender{
	M, F;
}

public class PersonMain {

	public static void main(String[] args) {
		Person3 p3 = new Person3("Gagandeep", "Singh", Gender.M);
		p3.enterPhoneNumber();
		p3.displayDetails();

	}

}


// 3.  Create a method which can perform a particular String operation based on the user’s choice. The method should accept the String object and the user’s choice and return the output of the operation. 
//  Add the String to itself
//   Replace odd positions with # 
//   Remove duplicate characters in the String 
//   Change odd characters to upper case
	