
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
////////////////////////////////////////
public class myTest {
static shoppingCart shop ;

        @BeforeClass
    public static void setUpClass() {
        
      shop = new shoppingCart();  
    } 
        @Test     
     public void test1() {


     int act = shop.countBook();
     assertTrue(act == 0 );
     }
    //////////////////// 
         @Test 
     public void test2() {

              shop.addBook("Java Book" , 127);   
              int act = shop.countBook();
              assertTrue(act == 1);
              int act2 = shop.totPrice();
              assertTrue(act2 == 127);

     }
     //////////////////
   @Test
     public void test3() {
       
                shop.addBook("Web design Book" , 100);   
                int act3 = shop.countBook();
                assertTrue(act3 == 2);
                int act4 = shop.totPrice();
                assertTrue(act4 == 227);

     }
     }

