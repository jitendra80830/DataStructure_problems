//Find the Maximum value of array
public class MaxArray{
	public static void main(String[] args){
		int arr[]={1,22,-500,12,3,441,11};
		//int max=0;
		int max=Integer.MIN_VALUE;
		for(int element : arr){
			if(element>max){
				max=element;
			}
		}
		System.out.print("Maximum value of Array is "+max);
	}
}