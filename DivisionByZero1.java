

	/*
	* This program is used to demonstrate the use of exception
	* handling
	*/
	public class DivisionByZero1 {
	public void division(){
	int iNumerator = 10;
	int iDenominator = 0;
	try{
	 System.out.println(iNumerator + "/" + iDenominator
	 + "=" +(iNumerator/iDenominator));
	}
	 catch (NullPointerException e){
	 System.out.println("Null Pointer Exception ");
	}
	 finally {
	 System.out.println("End of Excep.Finally Block");
	}
	System.out.println("After Exception Handler ");
	}
	public static void main(String args[]){
	new DivisionByZero1().division();
	 System.out.println("End of Main ");
	}
	}


