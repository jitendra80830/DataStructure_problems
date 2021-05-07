
package com.mycompany.datastructure;


class LinearSearching {
    
    
    int linearsearch(int[] arr,int size,int target){
        for(int index = 0;index<size;index++){
            if(arr[index] == target){
                return  index;
            }
            
        }
        return -1;
    } 
}
public class LinearSearch1{
    public static void main(String[] args){
        LinearSearching search = new LinearSearching();
        int arr[] = {2,3,6,11,77,88,3};
        int size = arr.length;
        int s = search.linearsearch(arr, size, 11);
        System.out.println("Searching element is at this index: "+s);
    }
}
