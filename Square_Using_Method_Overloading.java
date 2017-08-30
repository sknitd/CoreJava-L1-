/**
* Program to find the square of the given number.
*/
class MethodOverLoadingDemo{
public int findSquare( int iNumber){
return ( iNumber * iNumber);


}

public double findSquare(double iNumber)
{
	return (iNumber* iNumber);
	}
//Add an overloaded method that takes a double value
//and returns the square of it
}




public class Square_Using_Method_Overloading {

	public static void main(String[] args) {
		MethodOverLoadingDemo mold=new MethodOverLoadingDemo();
		System.out.println(mold.findSquare(5));
		System.out.println(mold.findSquare(6.4));
		
		
	}
		// TODO Auto-generated method stub

	}

