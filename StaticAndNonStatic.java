
/**
* This class contains a static variable and a non static
* instance variable. The static variable is accessed through a
* static method and the non static instance variable is accessed
* through a non static method.
*/
public class StaticAndNonStatic {
static int iStatic;
static char cChoice;
/* Constructor. increments objectCount when an object is
* created and sets the instance variable userChoice with the
* parameter passed.
*/
StaticAndNonStatic(char choice) {
iStatic++;
cChoice =choice;
}
/* The static variable objectCount is displayed using this
* method.
*/
static void displayObjectCount() {
System.out.println("Value of iStatic : "+ iStatic);
}
/* The non static instance variable userChoice is displayed
* using this method.
*/
static void displayUserChoice(){
System.out.println("The user choice is "+ cChoice);
}
}