package com.mycompany.datastructure;


public class MajoritiEle {
    
    int getMajoMajoritiElerityElements(int arr[],int size){
        int majority = 0;
        int count = 1;
        for(int index = 1;index<size;index++){
            if(arr[majority] == arr[index])
                count++;
            else
                count--;
            if(count == 0){
                majority = index;
                count=1;
            }
        }
        return arr[majority];
        
    }
    boolean isMajorityEle(int arr[],int size,int cand){
        int count =0;
        for(int index = 0;index<size;index++){
            if(arr[index] == cand)
                count++;
        }
        if(count>size/2)
            return true;
        else 
            return false;
        
    }
    void printMajority(int arr[],int size){
        int cand = getMajoMajoritiElerityElements(arr,size);
        
        if(isMajorityEle(arr,size,cand))
            System.out.println(" "+cand+" ");
        else
            System.out.println("Not majority elements: ");
        
    }
    public static void main(String[] args){
        MajoritiEle find = new MajoritiEle();
        
        int arr[] = {2,2,5,6,2,2};
        int size = arr.length;
        find.printMajority(arr, size);
        
        
    }
    
}
