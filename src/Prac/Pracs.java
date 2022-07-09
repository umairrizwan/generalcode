package Prac;

import java.util.Random;
import java.util.Scanner;
import java.util.Base64;


public class Pracs {
	
	public String randomString;
	public  String emailText;
	public String patternText="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public static String[] names = {"John","Girma","Rhodes"};
	
//	  public static String encode(String input) {
//
//		  
//		  
//	      return Base64.getEncoder().encodeToString(input.getBytes());
//
//	  }

	  public static String decryptString(String encryptedPassword) {
	        String decoded = new String(Base64.getDecoder().decode(encryptedPassword));
	        return decoded;
	    }
	  
	  public static String encryptString(String clearString)
	  {
		String encodeString =  new String(Base64.getEncoder().encodeToString(clearString.getBytes()));
		return encodeString;
	  }
	  
	  
	  public static void starMethodIncremental()
	  {
		  for(int i=0; i<=5;i++) {
			  
			  for(int j=0; j<=i;j++)
			  {
				  System.out.print("+");
			  }
			  System.out.println();
		  }
	  }
	  
	  public static void starMethodDecremental()
	  {
		  for(int i=0 ; i<=5 ; i++)
		  {
			  for(int j=5 ; j>=i ; j--)
			  {
				  System.out.print("*");
			  }
			  
			  System.out.println();
		  }
	  }
	public static void main(String[] args)
	{
		 // starMethodIncremental();
		starMethodDecremental();
		String pwd = "123qwe";
		String newPwd= Pracs.decryptString(pwd);
		System.out.println("The new password is "+newPwd);
		
		String clearString = "123qwe";
		String newEcodeString = Pracs.encryptString(clearString);
		System.out.println("The new encoded string is "+newEcodeString);
	
        
        
		System.out.println("The name at start is "+names[0]);
		System.out.println("The name at end is "+names[2]);
		
	
		
		
		
		// Pracs.generateRandomNumber();
		 
		 
//		 Scanner scan = new Scanner(System.in);
//		 System.out.println("Enter month from 1 to 12");
//		 int month = scan.nextInt();
//		 
//		 switch(month) {
//		 case 1: 
//			 System.out.println("The "+ month + "is january");
//			 break;
//			 
//		 case 2:
//			 System.out.println("The "+ month +" is Febuary");
//			 break;
//			 
//		 case 3:
//			 System.out.println("The "+month+" is March");
//			 break;
//			 
//		 case 4:
//			 System.out.println("The "+month+" is April");
//			 
//			 default :
//				 System.out.println("This month does not exist");
//		 }
		 
		 
		 Car corolla = new Car(2009, "Toyota", 65000);
		 System.out.println(corolla.model);
		 System.out.println(corolla.make);
		 System.out.println(corolla.mileage);
	}

	
	
	
	public static int generateRandomNumber() {
        Random random = new Random();
        int number=0;

        for (int i = 0; i <= 0; i++) {
            number = 1 + random.nextInt(500);
            System.out.print(number + " ");
        }
        return number;
    }
	
	
	
}



class Car
{
   int model;
   String color;
   String make;
   int mileage;
   String transmission;
   boolean registered;
   
   
   public Car()
   {
	  mileage=10;
	  model = 2000;
   }
   
   public Car(int model, String make, int mileage)
   {
	   this.model = model;
	   this.make = make;
	   this.mileage = mileage;
	   transmission="";
	   registered=true;
   }

}
