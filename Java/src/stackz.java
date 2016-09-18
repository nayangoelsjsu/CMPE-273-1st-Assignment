import java.util.*;
import java.lang.*;

 public class stackz{
  public static void main(String args[]){
    System.out.println("Enter the number of disks");
    Scanner scan= new Scanner(System.in);
    int n=scan.nextInt();
    int count= stacker(n);
    System.out.println(count);
  }

  public static int stacker(int n){
    Stack s= new Stack();
    Stack a= new Stack();
    Stack d= new Stack();
    double total= Math.pow(2,n);
    total=total-1;
    int count=0;
    for(int j=n;j>0;j--){
      s.push(j);
    }
    if(n%2!=0){
      for(int i =1;i<=total;i++){
        if(i%3==1){
        if(s.size()==0){
          s.push(d.pop());
          count++;
          System.out.println("d to s");
          continue;
        }
        if(d.size()==0){
          d.push(s.pop());
          count++;
          System.out.println("s to d");
          continue;

        }
        int stop= (Integer) s.peek();
        int dtop= (Integer) d.peek();
         if(stop<dtop){
          d.push(s.pop());
          count++;
          System.out.println("s to d");
          continue;
        }
        else{
          s.push(d.pop());
          count++;
          System.out.println("d to s");
          continue;
        }
      }

      if(i%3==2){
        if(s.size()==0){
          s.push(a.pop());
          count++;
          System.out.println("a to s");
          continue;
        }
        if(a.size()==0){
          a.push(s.pop());
          count++;
          System.out.println("s to a");
          continue;
        }
        int stop= (Integer) s.peek();
        int atop= (Integer) a.peek();
        if(stop<atop){
          a.push(s.pop());
          count++;
          System.out.println("s to a");
          continue;
        }
        else{
          s.push(a.pop());
          count++;
          System.out.println("a to s");
          continue;
        }
      }

      if(i%3==0){
        if(a.size()==0){
          a.push(d.pop());
          count++;
          System.out.println("d to a");
          continue;
        }
        else if(d.size()==0){
          d.push(a.pop());
          count++;
          System.out.println("a to d");
          continue;
        }
        int atop= (Integer) a.peek();
        int dtop= (Integer) d.peek();
        if(atop<dtop){
          d.push(a.pop());
          count++;
          System.out.println("a to d");
          continue;
        }
        else{
          a.push(d.pop());
          count++;
          System.out.println("d to a");
          continue;
        }
      }
    }
  }

  else{

    for(int i =1;i<=total;i++){
        if(i%3==1){
        if(s.size()==0){
          s.push(a.pop());
          count++;
          System.out.println("a to s");
          continue;
        }
        if(a.size()==0){
          a.push(s.pop());
          count++;
          System.out.println("s to a");
          continue;

        }
        int stop= (Integer) s.peek();
        int atop= (Integer) a.peek();
         if(stop<atop){
          a.push(s.pop());
          count++;
          System.out.println("s to a");
          continue;
        }
        else{
          s.push(a.pop());
          count++;
          System.out.println("a to s");
          continue;
        }
      }

      if(i%3==2){
        if(s.size()==0){
          s.push(d.pop());
          count++;
          System.out.println("d to s");
          continue;
        }
        if(d.size()==0){
          d.push(s.pop());
          count++;
          System.out.println("s to d");
          continue;
        }
        int stop= (Integer) s.peek();
        int dtop= (Integer) d.peek();
        if(stop<dtop){
          d.push(s.pop());
          count++;
          System.out.println("s to d");
          continue;
        }
        else{
          s.push(d.pop());
          count++;
          System.out.println("d to s");
          continue;
        }
      }

      if(i%3==0){
        if(d.size()==0){
          d.push(a.pop());
          count++;
          System.out.println("a to d");
          continue;
        }
        else if(a.size()==0){
          a.push(d.pop());
          count++;
          System.out.println("d to a");
          continue;
        }
        int dtop= (Integer) d.peek();
        int atop= (Integer) a.peek();
        if(dtop<atop){
          a.push(d.pop());
          count++;
          System.out.println("d to a");
          continue;
        }
        else{
          d.push(a.pop());
          count++;
          System.out.println("a to d");
          continue;
        }
      }
    }
  }
return count;
  }
 }