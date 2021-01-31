//Rotaion Array

public class RotateArray{
	//Function to left rotate arr[] of size n by d
	void leftRotate(int arr[],int n){
		int temp=arr[0];
		for(int i=0;i<n;i++){
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}
	void rotateArray(int arr[],int n,int d){
		for(int i=0;i<d;i++){
			leftRotate(arr,n);
		}
	}
	void printArray(int arr[],int n){
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
		RotateArray rotate=new RotateArray();
		int arr[]={1,2,3,4,5,6,7};
		rotate.rotateArray(arr,6,2);
		rotate.printArray(arr,7);
	}
}
