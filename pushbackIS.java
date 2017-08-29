import java.io.*;
public class pushbackIS {

   public static void main(String args[])throws IOException {
      ByteArrayOutputStream bOutput = new ByteArrayOutputStream(100);

      while( bOutput.size()!= "This is Java Input/Output".length() ) {
       
         bOutput.write("This is Java Input/Output".getBytes());  
      }
      byte b [] = bOutput.toByteArray();// converts input to byte array
     
      
     

   
      ByteArrayInputStream bInput = new ByteArrayInputStream(b);
    
      int ctr=0;
      PushbackInputStream push = new PushbackInputStream(bInput);  
      int i;        
          while( (i = push.read())!= -1) {  
              ctr++;
              if(ctr==1)
            	  {
            	  System.out.println((char)i);
            	  push.unread(Character.toLowerCase((char)i));  // converts first character to
            	  //lower case
            	  }
        	  
        	 
              else
                          System.out.print((char)i);  
              
         }        
         bInput.reset(); 
      }
}