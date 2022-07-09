package Prac;

import java.util.Scanner;

public class Practice2 {




	
	//Reverse String
	public void reserveString(String name)
	{
		String myname = name;
		
		int len = myname.length();
		
		String reverseName= "";
		
		for(int i = len-1 ; i>=0; i--)
		{
			reverseName = reverseName + myname.charAt(i);
		}
		
		System.out.println("The reverse name is "+ reverseName);
	}
	
	//String replace
	public void stringReplace(String replaceStr)
	{
		String string = replaceStr;
		
		string = string.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The replaced string is "+ string);
		
	}
	
	//Print * sign in incremental
	public void printStar()
	{
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//Print * in diamond shape
	public void printInDiamondShape()
	{
		for(int i=0; i<7; i++)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k = 0 ; k<=i ; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//print inverse diamond
	public void inverseDiamond()
	{
		for(int i=6;i>0 ;i--)
        {
                for(int j=0;j<6-i;j++)
         
                {
                        System.out.print(" ");
                }
                //for(int j=0;j<(i*2)-1;j++)
                	   for(int j=0;j<(i*2)-1;j++)
         
                {
                		
                        System.out.print("*");
                }
               System.out.println();
        }    
	}
	//Print factorial
	public void printFactorial(int number)
	{
		
		int factorial = 1;
		
		do
		{
			factorial = factorial * number;
			number--;
		}
		while(number!=0);
		
		System.out.println("The factorial is "+ factorial);
	}
	
	
	public void returnSmallestValue(int[] array)
	{
		int min = array[0];
		
		for(int i=0; i<array.length; i++)
		{
			if(min > array[i])
			{
				min = array[i];
			}
		}
		
		System.out.println("The smallest value is "+ min);
	}
	
	
	public static void main(String args[])
	{
		Practice2 prac = new Practice2();
		
		int[] numArray = {22,43,46,7,54,66,55,77,44,33};
	  
		prac.reserveString("UmairRizwan");
		prac.stringReplace("&*^$^&&^$&%^*&^()~####(*&(Umair(*&(**^%$^%£");
		//prac.printStar();
		prac.printInDiamondShape();
		prac.printFactorial(6);
		prac.inverseDiamond();
		
		prac.returnSmallestValue(numArray);
	}
	
	
	
}
