package codility;

import java.util.Iterator;

public class BinaryGaps {
	
	public int binaryGap(int number)
	{
		String bString = Integer.toBinaryString(number);
		
		int count=0;
		int maxCount=0;
		boolean started = false;
		
		for (int i = 0; i < bString.length() ; i++) {
			String c = bString.substring(i,i+1);
			if(c.equals("1")) {
			if(started)
			{
				if(count > maxCount)
				{
					maxCount = count;
				}
				
			}
			
			
			started = true;
			count=0;
			}
			if(c.equals("0"))
			{
				count++;
			}
		}
		return maxCount;
	}
	
	
	public static void main(String[] args) {
		BinaryGaps obj = new BinaryGaps();
		System.out.println(obj.binaryGap(9));
	}

}
