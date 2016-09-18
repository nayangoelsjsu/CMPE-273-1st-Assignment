import java.util.*;


class threader1 extends Thread{
  Thread t;
  String tname;
  int n, r,nf;
  int numb;
  threader1(String name,int nt){
    tname= name;
    n=nt;
    nf=1;
    System.out.println("Created="+tname);
  }
  public int cal(int n){
    for(int i=n;i>0;i--){
      nf=nf*i;
  }
      return nf;
  }

  public void run(){
    System.out.println("running="+tname);
    try{
        int a=cal(n);
        numb=nf;
        System.out.println("factorial="+nf);
        Thread.sleep(50);
      }
      
    
    catch(Exception e){
      System.out.println("interrupted");
    }
    System.out.println("exited="+tname);
  }
  public int getval(){
    return numb;
  }
  public void start(){
    System.out.println("started="+tname);
    if(t==null){
      t= new Thread(this,tname);
      t.start();
    }
  }
}

public class multithreadigz{
  public static void main(String args[]){
    System.out.println("Enter value of n for 1st thread");
    Scanner scan= new Scanner(System.in);
    int nt1= scan.nextInt();
    System.out.println("Enter value of n for 2nd thread");
    scan= new Scanner(System.in);
    int nt2= scan.nextInt();
    threader1 t1= new threader1("t1",nt1);
    t1.start();
    threader1 t2= new threader1("t2",nt2);
    t2.start();
  }
}