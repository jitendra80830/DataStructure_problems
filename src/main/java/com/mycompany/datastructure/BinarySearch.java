
package com.mycompany.datastructure;

import java.lang.*;


public class BinarySearch {
    
    int binarySearch(int arr[],int l_index,int r_index,int target){
        int m_index;
        while(l_index <= r_index){
            m_index=l_index + (l_index-r_index);
            
            if(arr[m_index] == target)
                return m_index;
            if(arr[m_index]<target)
                l_index = m_index+1;
            else
                r_index = m_index-1;
        }
        return -1;
    }
    
    public static void main(String[] args){
        BinarySearch b = new BinarySearch();
        try{

            int arr[]= {1,2,5,7,8,9};
            int n = arr.length;
            int target = 5;

            int result = b.binarySearch(arr , 0 ,n - 1 , target);
            System.out.println("Index at: "+result);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print(e);
            
        }
    }
}