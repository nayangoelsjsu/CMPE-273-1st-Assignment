import java.util.*;
import java.lang.*;

public class collectionz{
  public static void main(String args[]){
   int b= collector();
  }

  public static int collector(){
     HashMap lucky= new HashMap();
    int flag=0,count=0; 
    while(flag!=1){
      System.out.println("Enter the Pnone numbers of participants or Enter 1 to exit");
      Scanner scan= new Scanner(System.in);
      flag= scan.nextInt();
      if(flag!=1){
        count++;
        lucky.put(count,flag);
      }
    }
    int first= (int) (Math.random()*(count+1)+1);
    int second= (int) (Math.random()*(count+1)+1);
    while(first==second){
      second= (int) (Math.random()*(count+1)+1);
    }
    Object fnum= lucky.get(first);
    Object snum= lucky.get(second);
    System.out.println("First Prize goes to: "+fnum);
    // System.out.println("Second Prize goes to: "+snum);
    if(first>1 && first<count ){
      return 1;
    }
    else{
      return 0;
    }
  }
}