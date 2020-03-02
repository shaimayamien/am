
import java.util.ArrayList;

public class shoppingCart {
    
 ArrayList <book>bookList = new ArrayList<book>();

    public int countBook()
    {   return bookList.size();
    }
//////////////////////////
 public   void addBook(String java_Book, int i) {
    book newBook = new book(java_Book , i);    
    bookList.add(newBook);
    }
///////////////////////////
  public  int totPrice() {
    int p = 0;
    for (int i=0; i< bookList.size(); i++)
    {
    p += bookList.get(i).price;
            }
    return p;
    }
//////////////////////////    
}
