package Prac;
import java.util.LinkedList;
import java.util.Iterator;



public class LinkyListy {
	
	public static void main(String[] args)
	{
	
			LinkedList<Integer> linky = new LinkedList<Integer>();
			
			linky.add(3);
			linky.add(55);
			linky.add(89);
			
	       
			Iterator<Integer> it = linky.iterator();	
			while(it.hasNext())
			{
				if(it.next()==55)
				{
					System.out.println("Bingo you have 55 value in it");
				}
			}
	
	
	}
	

}
