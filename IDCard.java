package id;

import java.util.Scanner;
import static id.PrintDetail.Write;
import static id.PrintDetail.GetDetails;


public class IDCard {
	
	  private String firstName;
	  private String lastName;
	  private String Name;
	  private String password;
	  private String department;
	  private String email;
	  private String Num;
	  private int mailboxCapacity=500;
	  private int defaultPasswordlength=10;
	  private String companySuffix= "sgsits.com";


	// Constructor to receive the first name and last lastName
	   public IDCard(String firstName, String lastName,String Num)
	  {
	   this. firstName = firstName;
	   this. lastName  = lastName;
	   this.Name=this.firstName+ this.lastName;
	   this.Num = Num;
	   System.out.println("EMAIL CREATED  FOR: " +this.firstName +" " + this.lastName);


	// Call a method asking for the department - return the department
	   this.department = setDepartment();
	   System.out.println("Department: "+ this.department);


	// Call a method that return  for a return password
	   this.password = randomPassword(defaultPasswordlength);
	   System.out.println("Your password is:" +this.password);


	// Combine elements to generate Email
	   email= firstName.toLowerCase() +"."+ lastName.toLowerCase()+ "@"+ department +"."+companySuffix;
	   System.out.println("Your email is: " +email);
	    GetDetails(Name,department,email,Num);
	    PrintDetail a1=new PrintDetail();
	    Write();
	    a1.Read();
	   }
	// Ask for the Department

	  private String setDepartment()
	  {
	    System.out.println("New Worker:" + firstName + "\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 For Accounting\n0 for none\n Enter department code: ");
	    Scanner in = new Scanner(System.in);
	    int depChoice = in.nextInt();
	    if (depChoice ==1) { return "sales";}
	    else if (depChoice ==2) { return "devlopment";}
	    else if (depChoice ==3) { return "account";}
	    else { return "";}
	   }


	// Generate a random password
	private String randomPassword (int lenght)
	 {
	  String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%!";
	  char[] password = new char[lenght];
	  for(int i=0;i<lenght;i++)
	  {
	    int rand= (int)(Math.random()* passwordSet.length());
	    password[i]= passwordSet.charAt(rand);
	  }
	  return new String(password);
	  }

	
	 public String showInfo()
	 {
	   return "DISPLAY NAME:" + firstName + " "+lastName +
	          "\nCOMPANY EMAIL:" +email +
	          "\nMAILBOX CAPACITY:" +mailboxCapacity + "mb";
	 }


}
