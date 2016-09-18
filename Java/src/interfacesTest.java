import static org.junit.Assert.*;

import org.junit.Test;
public class interfacesTest{
 interfaces m1=new interfaces();
 
  
 
 @Test
 public void testInterface1()
 {
	 
	
	 assertEquals(m1.sum(4,2),6);
  }
 
 @Test
 public void testInterface2()
 {
	 
	
	 assertEquals(m1.dif(4,2),2);
  }
 @Test
 public void testInterface3()
 {
	 
	
	 assertEquals(m1.mul(4,2),8);
  }
 @Test
 public void testInterface4()
 {
	 
	
	 assertEquals(m1.div(4,2),2);
  }
}