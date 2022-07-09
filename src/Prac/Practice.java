package Prac;

import java.util.*;

  

public class Practice {
	
	public int addAges()
	{
		int[] age= {17,24,31,44,53};
		
		int totalAge =0;
		
		for(int i=0; i<age.length; i++)
		{
			totalAge = totalAge + age[i];
		}
		
		return totalAge;
		
	}
	
//	public void findNumberInArray()
//	{
//		int[] intArray = new int[20];
//		
//		int found=0;
//		
//		for(int i=0 ; i<intArray.length ; i++)
//		{
//			intArray[i] = i;
//		}
//		
//		System.out.println("Please enter the number you want to search in Array");
//		Scanner inp = new Scanner(System.in);
//		int number = inp.nextInt();
//		
//		for(int i=0; i<intArray.length ; i++)
//		{
//			if(number == intArray[i])
//			{
//				found = 1;
//				System.out.println("Hurray you have found the number a position "+intArray[i]);
//				break;
//			}
//		}
//	}
	
	public void findNumberInArray(int[] array)
	{
		int found=0;
		System.out.println("Please enter number you want to find in array");
		Scanner inp = new Scanner(System.in);
		
		int number = inp.nextInt();
		
		for(int i=0; i< array.length; i++)
		{
			if(number==array[i])
			{
				System.out.println("The number has been found "+array[i]+" and at position "+i);
				found=1;
			}
		}
		
		if(found==0)
		{
			System.out.println("The number has not been found in array");
		}
	}
	
	
	public double raisePower(double number, int power)
	{	
		
		
		double result = 1.0;
		
		while(power != 0)
		{
			result = result * number;
			power = power - 1 ;
		}
		
		return result;
	}
	

	public void reverseInteger()
	{
		System.out.println("Plase enter the integer numbers to reverse");
		Scanner  inp = new Scanner(System.in);
		
		int number = inp.nextInt();
		
		int result=0;
		
		while(number!=0)
		{
			result = result * 10 + number % 10;
			number = number /10;
		}
		
		System.out.println("The reverse integer is "+ result);
	}
   
   public void switchCaseSchoolGrade(String grade)
   {
	   switch(grade)
	   {
	       case "A":
		   System.out.println("Excellent you have got A grade");
		   break;
		   
	       case "B":
	    	   System.out.println("Very good you have got B grade");
	    	   break;
	    	   
	       case "C":
	    	   System.out.println("Ok you have got C grade");
	    	   break;
	    	   
	       case "D":
	    	   System.out.println("You need to improve as you have got grade D");
	   }
   }
		
	public static void main(String args[])
	{
		
		Practice prac = new Practice();
	//	prac.reverseInteger();
	//	prac.sumOfNumbers(1);
	//	prac.factorial();
	//	double result =  prac.raisePower(4,3);
		//System.out.println("The result is "+result);
		//System.out.println("The total average age is "+prac.addAges());
		
		
		int[] array = {1,2,3,4,5,6,7,22,33,55,66,76,876,54};
		prac.findNumberInArray(array);
		
		
		//prac.switchCaseSchoolGrade("B");
		int number = 123456;
		
		//prac.guessingGame();
		
		int reserve = 0;
		
//		while(number != 0)
//		{
//			reserve = reserve * 10 + number % 10;
//			
//			number = number / 10;
//		}
//		
//		System.out.println(reserve);
		
		
//		for(int i=0 ; i < 6 ; i++)
//		{
//            reserve = reserve * 10 + number % 10;
//			
//			number = number / 10;
//		}
//		
//		System.out.println("Printing after for loop "+reserve);
//	}
		
		
		
		
	}
	
	

	
	public void sumOfNumbers(int startNumber)
	{
		System.out.println("Till when you want to take the sum of numbers");
		
		Scanner inp = new Scanner(System.in);
		int upperLimit = inp.nextInt();
		
		int sum=0;
		while(startNumber<=upperLimit)
		{
			sum = sum + startNumber;
			startNumber++;
			
		}
		
		System.out.println("The sum of numbers are "+sum);
	}
	
	public void factorial()
	{
		System.out.println("Please enter you want the factorial of");
		Scanner inp = new Scanner(System.in);
		
		int number = inp.nextInt();
		
		int factorial = 1;
		
		while(number!=0)
		{
			factorial = factorial * number;
			number--;
		}
		
		System.out.println("The factorail is "+ factorial);
				
	}

	public void guessingGame()
	{
		
		
		
		int tryNum = 5;
		
		do
		{
			char c;
			System.out.println("Please enter the character you want to guess");
			Scanner inp = new Scanner(System.in);
			c = inp.next().charAt(0);
			
			if(c=='z')
			{
				
				
				System.out.println("Contgratz you have guess the right character which is "+c);
				tryNum=0;
			}
			else {
				   
				   
					tryNum = tryNum - 1;
					System.out.println("You guess it wrong and your remaining tries are "+tryNum); 			   
				   
				   
			     }
		}
		while(tryNum!=0);
	}
}
