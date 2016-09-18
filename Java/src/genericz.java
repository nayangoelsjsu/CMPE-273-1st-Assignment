import java.util.*;

public class genericz{
	public static <T extends Comparable<T>> T[] sortster(T[] arr){
		T temp;
		for (int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].compareTo(arr[j])>0){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String args[]){
		Integer[] a1={4,5,2,3,1,7,6};
		String[] a2={"orange","apple","banana","strawberry"};
		Character[] a3={'c','d','f','a','s','q','t','r','g'};
		Integer[] sorta1= sortster(a1);
		String[] sorta2= sortster(a2);
		Character[] sorta3= sortster(a3);
		for(int i=0;i<sorta1.length;i++){
			System.out.println(sorta1[i]);
		}
		for(int i=0;i<sorta2.length;i++){
			System.out.println(sorta2[i]);
		}
		for(int i=0;i<sorta3.length;i++){
			System.out.println(sorta3[i]);
		}
	}
}