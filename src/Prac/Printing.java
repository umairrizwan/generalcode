package Prac;

public class Printing {
	

	public void starPattern()
	{
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void starPatternInverse()
	{
		for(int i=5 ; i>=0 ;i--)
		{
			for(int j=0 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
//	public void pyramidPrint()
//	{
//		for(int i=0; i<=6; i++)
//		{
//			for(int j=5; j>=i ; j--)
//			{
//				System.out.print(" ");
//							
//			}
//			
//			for(int k=0 ; k<=i; k++)
//			{
//				System.out.print("*");
//				System.out.print(" ");
//			}
//			
//			
//			System.out.println();
//		}
//		
//		
//	}
	
	public void pyramidPrint()
	{
		for(int i=0; i<=7;i++)
		{
			for(int k=6; k>=i; k--)
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<=i ; j++)
			{
				
				System.out.print("* ");
				//System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Printing obj = new Printing();
	//	obj.starPattern();
		//obj.starPatternInverse();
		obj.pyramidPrint();
	}

}
