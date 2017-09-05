/*
* This java file contains a class that creates an array and uses
* methods to set and display the values of the array
*/
public class ArrayCreation {
int aiArray[];
/*
* Constructor to create an integer array that can hold
* maximum of twelve elements
*/
public ArrayCreation() {
aiArray = new int[12];
}
/**
* This method Stores the integers into the array using a
* loop
*/
public void arrayValues() {
for(int iIndex = 0;iIndex < 12;iIndex++) {
aiArray[iIndex] = iIndex+1;
}
}
public void arrayDisplay() {
for(int iIndex=0;iIndex<12;iIndex++) {

System.out.println("aiArray[ "+ iIndex +" ] = "+
aiArray[iIndex] );
}
}
}