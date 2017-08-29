/* Program to write and read primitive types to/from a file. */
import java.io.*;
class DataIOApp{
public static void main(String[] args) {
try {
DataOutputStream objDataOp =
new DataOutputStream(
new FileOutputStream("Trng"));
//(1)
double[] dExp = {9.5, 9.7,3.3, 2.9, 4.9};
int[] iEmpno = { 120, 210, 390, 480, 570 };
String[] sName = { "Ashwaq","Jagan","Konrad","Shekar"
, "Gopal"};
for(int iIndex=0;iIndex<dExp.length;iIndex++){ //(2)
objDataOp.writeDouble(dExp[iIndex]);
objDataOp.writeChar('\t');
objDataOp.writeInt(iEmpno[iIndex]);
objDataOp.writeChar('\t');
objDataOp.writeChars(sName[iIndex]);
objDataOp.writeChar('\n');
}
objDataOp.close();
}
catch (IOException E) {
System.out.println("Error: " + E);
}

try {
DataInputStream objDataIp = new DataInputStream(
new FileInputStream("Trng")); //(3)
double dExp=0.0;
int iEmpno=0;
String sName="";
double total = 0.0;
try {
while (objDataIp.available()>0) {
dExp=objDataIp.readDouble(); //(4)
total=total+dExp;
objDataIp.readChar();//throws out tab
iEmpno = objDataIp.readInt();
objDataIp.readChar();// throws out tab
sName = objDataIp.readLine();
System.out.println("Contents:\t"+ sName +"\t"+ dExp +"\t"+ iEmpno);
//System.out.println(iEmpno);
//System.out.println(dExp);
}
//System.out.println(dExp);
}
catch (EOFException e) {
System.out.println(" File Read Error : " + e);
}
objDataIp.close();
}
catch(Exception f){
System.out.println("File Not Found : "+ f);
}
}
}