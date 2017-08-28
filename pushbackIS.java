import java.io.*;
public class pushbackIS {

   public static void main(String args[])throws IOException {
      ByteArrayOutputStream bOutput = new ByteArrayOutputStream(100);

      while( bOutput.size()!= "This is Java Input/Output".length() ) {
         // Gets the inputs from the user
         bOutput.write("This is Java Input/Output".getBytes());  
      }
      byte b [] = bOutput.toByteArray();
      System.out.println("Print the content");
      
      for(int x = 0; x < b.length; x++) {
         // printing the characters
         System.out.print((char)b[x]); 
      }
      System.out.println("   ");

      int c;
      ByteArrayInputStream bInput = new ByteArrayInputStream(b);
     /* System.out.println("Converting characters to Upper case " );
      
      for(int y = 0 ; y < 1; y++ ) {
         while(( c = bInput.read())!= -1) {
            System.out.println(Character.toUpperCase((char)c));
         }*/
      int ctr=0;
      PushbackInputStream push = new PushbackInputStream(bInput);  
      int i;        
          while( (i = push.read())!= -1) {  
              ctr++;
              if(ctr==1)
            	  {
            	  System.out.println((char)i);
            	  push.unread(Character.toLowerCase((char)i));  
            	  }
        	  
        	 /* if(i == '#') {  
                  int j;  
                  if( (j = push.read()) == '#'){  
                       System.out.print("**");  
                  }else {  
                      push.unread(j);  
                      System.out.print((char)i);  
                  }  
              }*///else {  
              else
                          System.out.print((char)i);  
              //}  
         }        
         bInput.reset(); 
      }
}