import java.io.*;
public class FileCopy{
public static void main(String args[]){
//(1)
if (args.length != 2){
System.err.println("Usage:java FileCopy file1 file2");
System.exit(1);
}
File inFile = new File(args[0]); //(2)
File outFile = new File(args[1]); //(3)
try {
BufferedReader objReader = new BufferedReader(
new FileReader(inFile)); //(4)
BufferedWriter objWriter = new BufferedWriter(new FileWriter(outFile)); //(5)
String sStr = null;
while ((sStr =objReader.readLine()) != null) { //(6)
objWriter.write(sStr); //(7)
objWriter.newLine();
}
objReader.close();
objWriter.close();
}
catch(IOException e){
System.err.println(e);
System.exit(1);

}
}
}