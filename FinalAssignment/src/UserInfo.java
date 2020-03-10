import java.util.Scanner;

public class UserInfo extends Questions {
	String name,birthdate,gender;
	int age;
	boolean inputAge;
	void userInformation() {               // to get user information
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		System.out.println("enter your date of birth..");
		birthdate=scanner.nextLine();
		System.out.println("Enter your gender Male/Female");
		gender=scanner.nextLine();
		
		System.out.println("Enter Your Age..");
		age=scanner.nextInt();
		// printing user information
		System.out.println("Your username is " + name);
		System.out.println("Your date of birth is: "+birthdate);
		System.out.println("Your age is :"+age);
		System.out.println("Your gender is: "+gender);
	
	}
}
