import static org.junit.Assert.*;

import org.junit.Test;
public class arrayzTest{
 arrayz m1=new arrayz();

 
  
 
 @Test
 public void testarrayz1()
 {
	 int[] a= {2,2,1,0,0};
  assertArrayEquals(m1.arrayer("nayan",5),a);
  }

 @Test
 public void testarrayz2()
 {
	 int[] a= {1,1,3,0,2,1,0,1,0,1};
  assertArrayEquals(m1.arrayer("helloworld",10),a);
  }
 @Test
 public void testarrayz3()
 {
	 int[] a= {2,1,0,1,1};
  assertArrayEquals(m1.arrayer("vivek",5),a);
  }
 @Test
 public void testarrayz4()
 {
	 int[] a= {2,1,1,1,0,1};
  assertArrayEquals(m1.arrayer("tirath",6),a);
  }
 @Test
 public void testarrayz5()
 {
	 int[] a= {1,1,2,1,1,0,1,1};
  assertArrayEquals(m1.arrayer("abhishek",8),a);
  }
}