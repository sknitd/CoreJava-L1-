
public class SetterGettermethod {

//String g1,g2,g3;
String g="";
String grade(int m)
{
if(m>80 && m<100) g="A";
else if(m>73 && m<79) g="B+";
else if(m>65 && m<72) g="B";
else if(m>55 && m<64) g="C";
else if(m>0 && m<54) g="D";
	return g;
}
int setmarks(int m)
{
return m;	
}
void getmarks(int studentNo,int m)
{ SetterGettermethod obj=new SetterGettermethod();
	System.out.println("The marks for student  "+studentNo+" is = "+obj.setmarks(m)+" and the grade is ="+obj.grade(m));
	
}

}
