import java.*;
public class Assignment9 {
	public static void main(String args[])
	{
		try
		{
			Double d=new Double(args[0]);
			System.out.println("Absolute value of"+d+"="+Math.abs(d));
			System.out.println("Round of "+d+"="+Math.round(d));
			System.out.println("Squaren root of "+d+"="+Math.sqrt(d));
			
			
		}
		catch(Exception e){
			System.out.println("input should be a number!!");
		}
	}

}
