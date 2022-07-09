package Prac;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array2 {
	
	
	
	public void findSmallest(int[] numberArray)
	{
	    int smallest,largest;
	    
	    smallest = numberArray[0];
	    
		for(int i=0; i<numberArray.length ; i++)
		{		
			
			if(numberArray[i]>0 && numberArray[i] < smallest)
			{
				smallest = numberArray[i];
			}
		}
		
		largest = numberArray[0];
		
		for(int i=0; i< numberArray.length ; i++)
		{
			if(numberArray[i] >0 && numberArray[i] > largest)
			{
				largest = numberArray[i];
			}
		}
		System.out.println("The smalles value is "+ smallest);
		System.out.println("The largest value is "+largest);
	}
	
	
	//Find the smallest integer in an array
	public int solution(int[] A) {
        // write your code in Java SE 8
        
        //special case
        if(A.length ==0){
            return 1;
        }
        
        // Using "set" to check if an element has appeared
        // note: need to "import java.util.*" (important)
        Set<Integer> set = new HashSet<Integer>();
        
        // add elements into the set
        for(int i=0; i< A.length; i++){
            set.add(A[i]);
        }
        
        // note: the missing number is not possible bigger than (A.length)
        //       because there are only (A.length) numbers
        for(int i=1; i<= A.length; i++){
        	//System.out.println(i);
        	//System.out.println(set.contains(i));
        	
            if(set.contains(i) != true) // the 1st missing element
                return i;
        }
        
        // means: there are no missing numbers from 1 to A.length
        // Therefore, the missing number is "A.length+1" (important)
        return A.length+1;
    }
	
	
	
	
  
	
	
   public int frogJump(int X, int Y, int D)
   {
	   int distance = Y-X;
	 
	   int jumps = (int)Math.ceil((float)distance / D);
	   return jumps;
   }
	
   
   public int missingElementInArray(int[] Array)
   {
	   int count=0;
	   Set<Integer> set = new HashSet<Integer>();
	   for(int i=0; i<Array.length ; i++)
	   {
		   set.add(Array[i]);
	   }
	   
	   for(int i=1;i<=Array.length;i++)
	   {
		   if(set.contains(i) != true)
		   {
			   count=i;
			  return count;
		   }
	   }
	   
	   return count;
	  // return Array.length+1;
   }
	public static void main(String[] args)
	{

	    Array2 obj = new Array2();
	  // System.out.println(obj.binaryGap(529));
	    
	    //obj.findSmallest(array);
	    
	     int[] array = {3,1,2,5};
	     
	    int result =  obj.solution(array);
	     
	    System.out.println("The  missing numebr is "+result);
        	    
	  // System.out.println( obj.binaryGaps(529));
	   
	  //System.out.println( obj.frogJump(10, 85, 30));
	     
	  System.out.println( obj.missingElementInArray(array));
	    
	}
	
	

}
