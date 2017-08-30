
public class ManipulationOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=0;
		String s="";
		for(int i=0;i<args.length;i++)
		{
			for(int j=0;j<args[i].length();j++)
			{
				char ch=args[i].charAt(j);
				if(ch=='w' || ch=='W')
				{
					w++;
					s=s+'T';
				}
				else s=s+ch;
			}
			args[i]=s.toUpperCase();
			s="";
		
		}
		
		System.out.println(args[0]+args[1]);
		
		

	}

}
