import static org.junit.Assert.*;

import org.junit.Test;
public class stackzTest{
 stackz m1=new stackz();

 
  
 
 @Test
 public void teststackz1()
 {
  assertEquals(stackz.stacker(3),7);
  }

 @Test
 public void teststackz2()
 {
//	 int[] a= {1,1,3,0,2,1,0,1,0,1};
  assertEquals(stackz.stacker(8),255);
  }
}