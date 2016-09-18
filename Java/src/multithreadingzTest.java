import static org.junit.Assert.*;

import org.junit.Test;
public class multithreadingzTest{
 threader1 m1= new threader1("Thread 1",3);
 threader1 m2= new threader1("Thread 2",4); 
  
 
 @Test
 public void testMultit1()
 {
  assertEquals(m1.cal(3),6);
  }
 @Test
 public void testMultit2()
 {
  assertEquals(m2.cal(4),24);
 }
}