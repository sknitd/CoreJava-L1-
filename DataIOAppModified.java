/* Program to write and read primitive types to/from a file. */
import java.io.*;
class DataIOAppModified{
public static void main(String[] args) {
try {
BufferedOutputStream objDataOp =
new BufferedOutputStream(
new FileOutputStream("Trng"));
//(1)
double[] dExp = {9.5, 9.7,3.3, 2.9, 4.9};
int[] iEmpno = { 120, 210, 390, 480, 570 };
String[] sName = { "Ashwaq","Jagan","Konrad","Shekar"
, "Gopal"};
for(int iIndex=0;iIndex<dExp.length;iIndex++){ //(2)
//objDataOp.writeDouble(dExp[iIndex]);
objDataOp.write((dExp[iIndex]+"").getBytes());;
objDataOp.write(('\t'+"").toString().getBytes());
objDataOp.write((iEmpno[iIndex]+"").getBytes());
objDataOp.write(('\t'+"").toString().getBytes());
objDataOp.write(sName[iIndex].getBytes());
objDataOp.write(('\n'+"").toString().getBytes());
}
objDataOp.close();
}
catch (IOException E) {
System.out.println("Error: " + E);
}

try {
BufferedInputStream objDataIp = new BufferedInputStream(new FileInputStream("Trng")); //(3)
double dExp=0.0;
int iEmpno=0;
String sName="";
double total = 0.0;
int ctr=0;
try {
while (objDataIp.available()>0) {
	//objDataIp.read();
//dExp=objDataIp.read(); //(4)
//total=total+dExp;
//objDataIp.readChar();//throws out tab
//iEmpno = objDataIp.read();
//objDataIp.readChar();// throws out tab
//sName = objDataIp.read();
//System.out.println("Contents:\t"+ sName +"\t"+ dExp +"\t"+ iEmpno);
	
	//if((char)objDataIp.read()=='\t')
	//	{System.out.println("hjfbsj");ctr++;}
	System.out.print((char)objDataIp.read());
	//if(ctr==2){ System.out.println("\n"); ctr=0;}
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