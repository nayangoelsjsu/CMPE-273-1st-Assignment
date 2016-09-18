import java.util.*;
import java.lang.*;

public class arrayz{
	public static void main(String args[]){
		System.out.println("Enter the String");
		Scanner scan= new Scanner(System.in);
		String str= scan.nextLine();
		int n=str.length();
		int[] a= new int[n];
		a= arrayer(str,n);
		for(int i=0;i<n;i++){
			if(a[i]!=0){

			System.out.println(str.charAt(i)+"="+a[i]);
				
			}
		}
	}

public static int[] arrayer(String str,int n){

		char[] arr= new char[n];
		int[] visited= new int[n];
		int[] freq= new int[n];
		for (int i=0;i<n ;i++ ) {
			freq[i]=0;
			arr[i]= str.charAt(i);	
		}

		for(int i=0;i<n;i++){
			if(visited[i]!=1){
				visited[i]=1;
				freq[i]=freq[i]+1;
				for (int j=i+1;j<n ;j++) {
					if(visited[j]!=1){
						if(arr[i]==arr[j])
						{
						visited[j]=1;
						freq[i]=freq[i]+1;
						}
					}
					
				}
			}
		}
		return freq;
}
}