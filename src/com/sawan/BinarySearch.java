package com.sawan;

public class BinarySearch {

    public static void main (String[] args){
        int[] vals = {4,7,22,45,66,68,89,94};
        int key = 89;
        int indexPos = binarySearch(vals,key);
        if(indexPos != -1){
            System.out.println("Value found at index position: " + indexPos);
            System.out.println("Value at index position: " + vals[indexPos]);
        }else{
            System.out.println("Value not found in array");
        }
    }

    private static int binarySearch(int[] vals, int key){
        int retIndex = -1;
        int first = 0;
        int last = vals.length -1;
        int mid = (first+last)/2;
        System.out.println("mid index position: " + mid);
        while (first<=last){
            if(vals[mid]>key){
                last = mid-1;
            }else if(vals[mid]<key){
                first = mid +1;
            }else{
                return mid;
            }
            mid = (first+last)/2;
        }
        return retIndex;
    }

}
