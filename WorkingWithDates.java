import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class WorkingWithDates {

   public static void main(String args[]) {
      String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
         "Oct", "Nov", "Dec"};
      String days[]={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};      
      int year;
      
      
 
      
      GregorianCalendar gcalendar = new GregorianCalendar();
      Calendar cal=new GregorianCalendar();
   
      gcalendar.add(gcalendar.DATE, 90);
     cal.set(Calendar.DATE, 3);
     cal.set(cal.MONTH, 5);
     cal.set(cal.YEAR, 1995);
  
   cal.add(cal.DATE, 90);
      
     
      System.out.println(days[cal.get(cal.DAY_OF_WEEK)]+","+months[cal.get(cal.MONTH)]+" "+cal.get(Calendar.DATE)+","+cal.get(cal.YEAR));
  
   }
}