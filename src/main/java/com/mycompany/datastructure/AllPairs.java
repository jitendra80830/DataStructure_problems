
package com.mycompany.datastructure;

//find all pairs of unsorted array and Hasmap
import java.util.*;

public class AllPairs {
    
    public static void pairsAll(int arr1[],int arr2[],int l1,int l2,int sum){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<l1;i++)
            map.put(arr1[i],0);
        for(int j=0;j<l2;j++)
            if(map.containsKey(sum - arr2[j]))
                System.out.println(sum-arr2[j]+" "+arr2[j]+" = "+(sum-arr2[j] + arr2[j]));
            
        
    }
    public static void main(String[] args){
        int arr1[] = {2,4,5,2,12,5,3};
        int arr2[] = {3,4,7,4,7,8,21};
        int l1 = arr1.length;
        int l2 = arr2.length;
        int sum = 9;
        pairsAll(arr1,arr2,l1,l2,sum);
    }
    
}
