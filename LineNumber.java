/* Program to demonstrate the use of LineNumberReader
* and displays the line numbers along with lines read from a
* file */
import java.io.*;
public class LineNumber{
public static void main(String args[]) throws IOException{
try {
FileReader objFileIn =
new FileReader("Trng");
//(1)
/* Code to Generate the line number for the read lines
*/
LineNumberReader objLineNumber =
new LineNumberReader(objFileIn); //(2)
String sStr;
while ((sStr= objLineNumber.readLine()) != null){
System.out.println(objLineNumber.getLineNumber() +
". " + sStr);
//(3)
}
}
catch (IOException E) {
System.out.println(" Error : " + E);
}
}
}