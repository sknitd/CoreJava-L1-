/* This program will create three objects of
* ConstructorOverlad class and invokes the constructors
*/
public class ConstructorDemo {
public static void main(String args[]){
/* To invoke default (with no arguments) constructor */
ConstructorOverload obj1 = new ConstructorOverload();
/* To Invoke a Parameterized Constructor with one
Argument
*/
ConstructorOverload obj2 = new ConstructorOverload(10);
/* To Invoke a Parameterized Constructor with 2 Arguments
Wipro Technologies
Page 11Java – Step by Step Lab Guide
*/
ConstructorOverload obj3 = new ConstructorOverload(20,30);
}
}