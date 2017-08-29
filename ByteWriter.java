/* Prog. to demonstrate FileOutputStream, ByteArrayOutputStream,
* System.in streams
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class ByteWriter{
public void writeBytes(OutputStream outStream){
try {
outStream.write(65);
outStream.write(66);
outStream.write(67);
}
catch(IOException e){
System.out.println("Error = " + e);
}
}
public static void main(String [] args){
try{
ByteArrayOutputStream objByteArray =
new ByteArrayOutputStream();
FileOutputStream objFileOp =

new FileOutputStream("Trng");
ByteWriter objByte = new ByteWriter();
/* To Display it on the Monitor */
objByte.writeBytes(System.out);
System.out.println("\n");
/* Write to a byte array */
objByte.writeBytes(objByteArray);
/* To Write the content to a file */
objByte.writeBytes(objFileOp);
/* Printing all elements of the byte array */
byte bArray[] = objByteArray.toByteArray();
for(int iIndex=0;iIndex< bArray.length; ++iIndex){
System.out.println(bArray[iIndex]);
}
FileInputStream objFileIp =
new FileInputStream("Trng");
int iValue = objFileIp.read();
while(iValue != -1){
System.out.println((byte)iValue);
iValue = objFileIp.read();
}
objFileIp.close();
}
catch(IOException e){
System.out.println("Error : "+ e);
}
}
}