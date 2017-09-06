class Parent{
}
class Child extends Parent{
}
public class TypecastDemo{
public static void main(String args[]){
Parent[] arrParent;
Child[] arrChild;
arrParent = new Parent[10];
arrChild = new Child[20];
arrParent = arrChild;
//1
arrChild = (Child[])arrParent; //2
arrParent = new Parent[10];
arrParent = arrChild;// statement 1 is important for child to be casted to parent
arrChild = (Child[]) arrParent; //3
}
}