import java.*;
public class RandomNumber {
	
	public static void main(String args[])
	{
		float ran=(float) Math.random();
		
		if(ran<0.5)
			System.out.println("The Value is less than 0.5(using if-else)");
		else
			System.out.println("The Value is greater than 0.5(using if-else)");
		
		System.out.println(ran<0.5?"The Value is less than 0.5(using ternary operator)":"The Value is greater than 0.5(using ternary operator)");
		
	}

}
