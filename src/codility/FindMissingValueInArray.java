package codility;

import java.util.HashSet;
import java.util.Set;

public class FindMissingValueInArray {
	
	public int solution(int A[])
	{
		int count=0;
		Set<Integer> set= new HashSet<Integer>();
		
		for(int i =0 ; i< A.length ; i++)
		{
			set.add(A[i]);
			
		}
		
		for(int i=1; i<=A.length ; i++)
		{
			if(set.contains(i) != true)
			{
				count = i;
			}
		}
		
		return count;
		//return 0;
	}

	
	public static void main(String[] args) {
		
		FindMissingValueInArray obj = new FindMissingValueInArray();
		
		int[] Array = {2,3,1,5};
		
		System.out.println( obj.solution(Array));
	}
}
