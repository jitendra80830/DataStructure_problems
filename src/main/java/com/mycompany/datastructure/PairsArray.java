
package com.mycompany.datastructure;


public class PairsArray {
    
    static void printPairs(int arr[],int n,int sum){
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]+arr[j] == sum){
                    System.out.println("(" +arr[i] + ","+ arr[j]+")");
                }
            }
        }
        //https://www.tutorialcup.com/interview/hashing/given-two-unsorted-arrays-find-all-pairs-whose-sum-is-x.htm#
        
    }
    public static void main(String[] args){
        int arr[] ={1, 5, 7, -1, 5};
        int n = arr.length;
        int sum=6;
        printPairs(arr,n,sum);
    }
    
}
