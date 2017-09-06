import java.util.ArrayList;

public class reverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<10){ System.out.println("less than 10 nos have been entered");System.exit(0);}
		ArrayList<Double> arr= new ArrayList<>();
		try{
		for(int i=0;i<args.length;i++)
		{
			arr.add(new Double(args[i]));
		}
		
		for(int i=arr.size()-1;i>0;i--)
			System.out.println(arr.get(i));
		}
		catch(Exception e)
		{
			System.out.println("one of the inputs is not number!!");
		}

	}

	}
