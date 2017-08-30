public class CommandLineArguments
{
public static void main(String args[]) {
if (args.length < 2 || args.length > 2) {
System.out.println("Invalid no of arguments –Supply exactly two arguments");
System.exit(0);
}// modification as per asked in Step 6 in Assignment 7
try{
	Double d= new Double(args[0]),d1=new Double(args[1]),d2=d+d1;;
	System.out.println(d2);
}
catch(Exception e)
{
System.out.println(args[0]+" "+args[1]);
}}}