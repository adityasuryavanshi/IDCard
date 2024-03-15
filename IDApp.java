package id;
import java.util.Scanner;
public class IDApp {

	public static void main(String[] args) 
	{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter First Name");
            String aa= s.nextLine();
            System.out.println("Enter Last Name");
            String a= s.nextLine();
            System.out.println("Enter Mobile Number");
            String n= s.nextLine();
		 IDCard id1 = new IDCard(aa,a,n);
		    System.out.println(id1.showInfo());
	}
} 