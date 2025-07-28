package ConditionalStatement;

public class IfDemo {

	public static void main(String[] args) {
		
		int mark = 75;
		
		if(mark > 90)
		{
			System.out.println("Outstanding");
		}
		
		else if(mark >= 80)
		{
			System.out.println("Excellent");
		}
		
		else if(mark >= 70)
		{
			System.out.println("Very Good");
		}
		
		else if(mark >= 60)
		{
			System.out.println("Good");
		}
		
		else
		{
			System.out.println("Pass");
		}
		

	}

}
