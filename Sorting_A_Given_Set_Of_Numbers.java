
public class Sorting_A_Given_Set_Of_Numbers {

	public static void main(String[] args) {
		int c=0,d1=0;
		double swap=0.0;
		Double d[]=new Double[5];
		if(args.length<5 || args.length>5)
			System.out.println("Enter 5 numbers!!");
		
		else
			//storing of the numbers
		{ try{
			for(int i=0;i<args.length;i++)
			{
				d[i]=new Double(args[i]);
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);		
			}
		
		//sorting
		 for (c = 0 ; c < ( 5 - 1 ); c++)
		  {
		    for (d1 = 0 ; d1 < 5 - c - 1; d1++)
		    {
		      if (d[d1] > d[d1+1]) /* For decreasing order use < */
		      {
		        swap       = d[d1];
		        d[d1]   = d[d1+1];
		        d[d1+1] = swap;
		      }
		    }
		  }
		
		 System.out.println("Sorted numbers in ascending order:");
		 for(double e : d)
		 {
			 System.out.println(e);
		 }
		// TODO Auto-generated method stub

	}

}
}
