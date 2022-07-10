package Prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array {
	
	
	//Find the sum of squares
	public void sumOfSquares(int[] array)
	{
		int sum=0;
		
		for(int i=0; i<array.length; i++)
		{
			sum += array[i]*array[i];
			//System.out.println("The value is sum inside loop is "+sum);
		}
		
		System.out.println("The sum of squares is "+sum);
	}
	
//	//To find the number in an array
//    public void findNumberinArray(int number, int[] array)
//    {
//    	int count=0;
//    	for(int i=0; i<array.length ; i++)
//    	{
//    		if(array[i]==number)
//    		{
//    			System.out.println("The number have been found "+array[i]);
//    			count++;
//    		}
//    		
//    	}
//    	
//    	if(count==0)
//    	{
//    		System.out.println("No number has been found that is present in Array");
//    	}
//    }
	
	
	//To find the number in an array
	public void findNumberInArray(int number, int[] array)
	{
		boolean found = false;
		
		for(int i=0; i<array.length;i++)
		{
			if(number==array[i])
			{
				System.out.println("The number has been found "+array[i]+" at the index of "+i);
				found = true;
				break;
			}
			
			
		}
		
		if(found==false)
		{
			System.out.println("Sorry the number has not been found");
		}
		
		
	}
    
    public void countOccurenceOfCharInString(String word, char val)
    {
    	int count=0;
    	
    	for(char ch : word.toCharArray())
    	{
    		if(ch == val)
    		{
    			count++;
    		}
    	}
    	
    	System.out.println("The total number of occurence of chararcter "+val+" is "+count);
    }
	
//	//compare each element 0(nxn) --- worst solution
//    public void findDuplicateInArray(String[] names)
//    {
//    	int count=0;
//    	for(int i=0;i<names.length; i++)
//    	{
//    		for(int j=i+1; j< names.length;j++)
//    		{
//    			if(names[i]==names[j])
//    			{
//    				System.out.println("The duplicate String is "+names[i]);
//    				count++;
//    			}
//    		}
//    	}
//    	
//    	if(count==0)
//    	{
//    		System.out.println("There is no duplicate in an array");
//    	}
//    }
//	
    
    //Find duplicate in an array
    public void duplicateInArray(String[] word)
    {
    	int count=0;
    	for(int i=0; i<word.length; i++)
    	{
    		for(int j=i+1; j<word.length; j++)
    		{
    			if(word[i]==word[j])
    			{
    				System.out.println("The duplicate letter in String is "+word[j]);
    				count++;
    			}
    		}
    	}
    	
    	if(count==0)
    	{
    		System.out.println("There is no duplicate in String");
    	}
    }
    
	//Missing number in an array
	public void missingNumberInArray(int[] array)
	{
		int sum=0;
		int j=0;
		for(int i=0; i< array.length; i++)
		{
			sum = sum+array[i];
		}
		
		System.out.println("The sum is "+ sum);
		
		int sum1 = 0;
		
		
		for( j=j+1 ; j<=array.length ; j++)
		{
			sum1 = sum1 + j; 
		}
		
		System.out.println("The sum is "+ sum1);
		int result =  sum - sum1;
		
		System.out.println("The missing number is "+ result);
	}
	

	public void finSmallAndLargestNumber(int[] number)
	{
		int smallest=number[0]; 
		int largest=number[0];
		
		for(int i=0; i<number.length; i++)
		{
			if(number[i]<smallest)
			{
				smallest=number[i];
			}
			
			else if(number[i]>largest)
			{
				largest = number[i];
			}
			
		}
		
		System.out.println("Largest "+largest+" and smallest is "+smallest);
	}
	
	public void print2DArrayReverse(int[][] number)
	{
		int row;
		int col;
		
		int maxRow=3;
		int maxCol=3;
		
		
		
		for(row=0;row<maxRow;row++)
		{
			for(col=0;col<maxCol;col++)
			{
				Scanner inp = new Scanner(System.in);
				System.out.println("Please enter the value for "+number[row][col]);
				number[row][col] = inp.nextInt();
			}
		}
		
		for(row=2;row>=0;row--)
		{
			for(col=0;col<maxCol;col++)
			{
				System.out.print(number[row][col]);
			}
			System.out.println();
		}
	}
	
	
	//Using HashSet (Its a part of java collection), it stores unique values
	public void findDuplicateArrayUsingHash(String[] names)
	{
		Set<String> store = new HashSet<String>();
		
		for(String name : names)
		{
			if(store.add(name)== false)
			{
				System.out.println("The duplicate is "+ name);
			}
		}
	}
	

	
	public static void main(String [] args)
	{
		String [] names = {"OK","Python","C#","Ruby","Java","Python","OK","Ruby","TATA","Mercedes","Ferrari"};
		
		int[] numberss = {1,2,3,4,5,6,8,11,44,55,66,77};
		
		int[] numberz ={1,2,3,5,6,7,8,9};
		
		int[][] twoD_arr = new int[3][3];
		
		Array obj = new Array();
		
		obj.findDuplicateArrayUsingHash(names);
		
		obj.findNumberinArray(11, numberss);
		
		
		int[] numbers = {22,44,55,66,-66,-23,100};
		//obj.print2DArrayRevrse(twoD_arr);
		
		obj.finSmallAndLargestNumber (numbers);
		
		obj.sumOfSquares(numberss);
		obj.findNumberInArray(44, numberss);
		obj.duplicateInArray(names);
		obj.missingNumberInArray(numberz);
	}

}
