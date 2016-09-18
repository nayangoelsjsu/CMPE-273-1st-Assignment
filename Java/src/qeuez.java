import java.util.*;

public class qeuez{
  
  public static void main(String args[]){

    System.out.println("Enter the number of nodes in the graph");
    Scanner scan= new Scanner(System.in);
    int n=scan.nextInt();
    int[] arr=new int[n];
    arr=queuer(n);
    for(int i=0;i<arr.length;i++){
      System.out.println("node: "+arr[i]);
    }
    
    }

    public static int[] queuer(int n){
       int x=0;
      System.out.println("Enter the graph");
    int[][] graph= new int [n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.println((i+1)+"to"+(j+1)+": ");
        Scanner scan=new Scanner(System.in);
        graph[i][j]=scan.nextInt();
      }
    }
    int[] visited= new int [n];
    int[] node= new int[n];
    LinkedList que = new LinkedList();
    System.out.println("Enter Starting Node");
    Scanner scan= new Scanner(System.in);
    int start= scan.nextInt();
    start=start-1;
    visited[start]=1;
    que.add(start);
       while(que.size()!=0){
        node[x]=((Integer)que.remove()+1);
        int y=node[x]-1;
        x++;
        for (int i=0;i<n;i++){
          if(graph[y][i]==1){
            if(visited[i]!=1){
            visited[i]=1;
            que.add((i));
          }
          }
        }
       }
       return node;
    }
    
}