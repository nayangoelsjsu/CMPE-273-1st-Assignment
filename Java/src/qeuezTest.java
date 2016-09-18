import static org.junit.Assert.*;

import org.junit.Test;
public class qeuezTest{
 qeuez m1=new qeuez();

 
  
 
 @Test
 public void testqeuez1()
 {
	 int[] a= {1,2,4,3};
  assertArrayEquals(qeuez.queuer(4),a);
  }
}
