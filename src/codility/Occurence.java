package codility;
import java.util.*;

public class Occurence {
	
	


	    int solution(int X, int Y, int[] A) {
	        int N = A.length;
	        int result = -1;
	        int nX = 0;
	        int nY = 0;
	        for (int i = 0; i < N; i++) {
	            if (A[i] == X)
	                nX += 1;
	             if (A[i] == Y)
	                nY += 1;
	            if (nX == nY)
	                result = i;
	        }
	        return result;
	    }
	

	public static void main(String[] args) {
		Occurence obj = new Occurence();
		
		int[] array1 = {13,13,1,6};
		int[] array2 = {100,63,1,6,2,13};
		int[] array3 = {6,42,11,7,1,42};
		
		int result = obj.solution(6, 13, array2);
		System.out.println(result);
	}

}
