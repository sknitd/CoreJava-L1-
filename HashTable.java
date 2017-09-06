    import java.util.*;  
    public class HashTable  {
       public static void main(String args[]) {  
       // create and populate hash table  
    	   if(args.length==0 || args.length>1) {System.out.println("Zero or more than input");
    	   System.exit(0);
    	   }
       Hashtable<String, String> map = new Hashtable<String, String>();
     
    	 
       map.put("new york","USA");  
       map.put("Argentina", "South America");  
       map.put("Tokyo", "Japan");
       map.put("Zurich", "Switzerland");
       map.put("Karachi", "Pakistan");
       map.put("Colombo", "Si Lanka");
       map.put("Johannesburg", "South Africa");
       map.put("Cairo", "Egypt");
       map.put("Melbourne", "Australia");
       map.put("Dubai", "UAE");
       System.out.println("City = "+args[0]+" Country= "+(map.get(args[0])==null?"Not found!!":map.get(args[0])));
       
      
       }      
    }  