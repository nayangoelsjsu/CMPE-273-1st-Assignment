import java.util.*;

class interfaces implements calc
{
  public int sum(int x, int y)
  {
      int sums = x+y;
      System.out.println("sum="+sums);
      return sums;
  }
  public int dif(int x, int y)
  {
      int difs = x-y;
      System.out.println("dif="+difs);
      return difs;
  }
   public int mul(int x, int y)
  {
      int muls = x*y;
      System.out.println("mul="+muls);
      return muls;
  }
   public int div(int x, int y)
  {   
      if(y!=0){
      int divs = x/y;
      System.out.println("div="+divs);
      return divs;  }
      else{
        System.out.println("Divide by zero error");
        return 0;
      }
    }
  public static void main(String arg[])
  {
      interfaces obj = new interfaces();
      System.out.println("Enter:");
      System.out.println("1 for Sum");
      System.out.println("2 for dif");
      System.out.println("3 for mul");
      System.out.println("4 for div");
      Scanner scan = new Scanner(System.in);
      int n= scan.nextInt();
      System.out.println("Enter the numbers");
      scan = new Scanner(System.in);
      int x= scan.nextInt();
      scan = new Scanner(System.in);
      int y= scan.nextInt();
      switch(n){
        case 1: obj.sum(x,y);
        break;
        case 2: obj.dif(x,y);
        break;
        case 3: obj.mul(x,y);
        break;
        case 4: obj.div(x,y);
        break;
        default: System.out.println("Wrong choice"); 
      }
  }
}

interface calc
{
   public int sum(int x, int y);
   public int dif(int x, int y);
   public int mul(int x, int y);
   public int div(int x, int y);

}