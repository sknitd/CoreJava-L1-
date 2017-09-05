
public class Book{
String bookTitle;
float price;
/* Method to assign and return the value for the
datamembers of the class Book */
public void setName(String bookName) {
bookTitle = bookName;
}
public void setPrice(float cost){
price = cost;
}
public String getName(){
return bookTitle;
}
public float getPrice(){
return price;
}
}