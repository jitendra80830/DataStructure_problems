//Find the diblicate array
import java.util.ArrayList;

public class DuplicateArray{
	static void findDuplicates(int arr[],int len){
		
		//initializing ifpresent as false
		boolean ifpresent=false;
		
		//array list to store the values
		ArrayList<Integer> a=new ArrayList<>();
		
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]==arr[j]){
					// checking if element is
                    // present in the ArrayList
                    // or not if present then break
					if(a.contains(arr[i])){
						break;
					}
					// if element is not present in the
                    // ArrayList then add it to ArrayList
                    // and make ifPresent at true
					else {
						a.add(arr[i]);
						ifpresent=true;
					}
				}
			}
		}
		//if duplicate present then print arraylist
		if(ifpresent==true){
			System.out.print(a+" ");
		}
		else {
			System.out.print("No duplicate values in Array");
		}
	}
	public static void main(String[] args){
		int arr[]={12, 11, 40, 12, 5, 6, 5, 12, 11};
		int n=arr.length;
		findDuplicates(arr,n);
	}
}
						
	
	