//lenear Search
import java.util.Scanner;

public class LinearSearch{
	public static void main(String[] args){
		int n;
		int arr[]={11,22,3,45,12,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element which are you looking");
		n=sc.nextInt();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println(arr[i]+" element is present is the array");
			}
			System.out.println("Not found");
		}
		
	}
}
		