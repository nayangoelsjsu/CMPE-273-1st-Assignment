import static org.junit.Assert.*;

import org.junit.Test;
public class genericzTest{
 genericz m1=new genericz();
 
  
 
 @Test
 public void testgenericz1()
 {
	 Integer[] a1={4,5,2,3,1,7,6};
	 Integer[] b1={1,2,3,4,5,6,7};
	 assertArrayEquals(genericz.sortster(a1),b1);
  }
 
 @Test
 public void testgenericz2()
 {
	 String[] a2={"orange","apple","banana","strawberry"};
	 String[] b2={"apple","banana","orange","strawberry"};
	 assertArrayEquals(genericz.sortster(a2),b2);
 }
 
 @Test
 public void testgenericz3()
 {
	 Character[] a3={'c','d','f','a','s','q','t','r','g'};
	 Character[] b3={'a','c','d','f','g','q','r','s','t'};
	 assertArrayEquals(genericz.sortster(a3),b3);
 }
}