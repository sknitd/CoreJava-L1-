class Addition{
void fnAdd(int iFirst, int iSecond){
int iRes = iFirst + iSecond;
System.out.println("The output is " + iRes);
}
}
public class Summation {
public static void main (String args[]) {
Addition objAddition = new Addition();
objAddition.fnAdd(3,9);
}
}