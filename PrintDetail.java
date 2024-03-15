package id;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrintDetail {
	
	static String name;
    static String dep;
    static String emailid;
    static String num ;
    static void GetDetails(String n, String d,String e1,String N) {
        name=n;
        dep=d;
        emailid=e1;  
        num=N;
    }
   

    static void Write() {
        try {
            System.out.println("inside write method");
            FileWriter writer = new FileWriter("D://Details.txt", true);
            //writer.write("\r\n");
            writer.write("\r\n");
            writer.write("              ID Card-SGSITS                ");
            writer.write("\r\n");
            writer.write("    NAME \t\t\t :" + name);
            writer.write("\r\n");
            writer.write("    DEPARTMENT \t\t\t :" + dep);
            writer.write("\r\n");
            writer.write("    EMAIL ID \t\t\t :" + emailid);
            writer.write("\r\n");
            writer.write("    MOBILE NUMBER\t\t :" + num);
            writer.write("\r\n");
            writer.write("------------------------------------------------------");
            writer.write("\r\n");
            writer.write("------------------------------------------------------");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    static void Read()
    {
       try {
      File myObj = new File("/D://Details.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    }	

}
