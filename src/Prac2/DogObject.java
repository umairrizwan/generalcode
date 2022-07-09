package Prac2;

public class DogObject {

	public static void main(String[] args) 
	{ 
		new DogObject().go(); 
	}
	
	
	public void go() 
	{
		new GermanShepherd().bark();
		((Dog) new GermanShepherd()).bark();
		((Dog)new GermanShepherd()).sniff();
	}

	
}
