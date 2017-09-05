
import java.util.ResourceBundle;
public class ReadProperties{
/* Resource bundle class object */
ResourceBundle resourcebundle;
public ReadProperties(){
 resourcebundle=ResourceBundle.getBundle
 ("Training");
 /* getting the key names present in the properties
Java – Step by Step Lab Guide
Wipro Technologies Page 32
 file and split w r t ',' given in the properties
 in order to get each value which is separated by
 ','*/
 String sType[]=resourcebundle.
 getString("Type").split(",");
 String sBu[]=resourcebundle.
 getString("BU").split(",");
 String sLoc[]=resourcebundle.
 getString("Location").split(",");
/* Loop for getting each of the values present
 in the string array */
for (int iIndex=0;iIndex<sType.length;iIndex++){
System.out.println("Type :"+(iIndex+1));
System.out.println("Type :"+sType[iIndex]);
System.out.println("BU :"+sBu[iIndex]);
System.out.println("Loc :"+sLoc[iIndex]);
}
}
public static void main(String[] args) {
 ReadProperties readproperties=new ReadProperties();
 }
}