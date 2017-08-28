/* Program to Demonstrate the use BufferedReader and
* System.in to count the number of white space characters in the
* input.
*/
import java.io.*;
class BufferedReaderDemo{
public static void main(String s[]) throws IOException{
System.out.println("Enter the String to check");
/* Creates a filter for buffered reading from keyboard */
BufferedReader objReader = new BufferedReader(
new InputStreamReader(System.in));
//(1)
/* Reads from the Keyboard using the filter */
String sStr= objReader.readLine(); //(2)
System.out.println(sStr);
int iCount=0,iLoc;
/* To Count the number of balnk spaces */
for(int iIndex=1; iIndex<sStr.length();iIndex++){
iLoc=sStr.charAt(iIndex);
//(3)
if (iLoc == 32){
iCount++;
}
}
System.out.println("No. of Blankspaces ="+ iCount);
}
}