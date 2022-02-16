package com.sawan;

import java.util.ArrayList;
import java.util.List;

public class CircularRef {

    public static void main(String[] args) {
	// code to find judge
        int out = 0;
        int [][] result = {{1,3},{2,3},{3,1}};
        List<int []> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        List<Integer> lst3 = new ArrayList<>();

        for(int i = 0; i< result.length; i++){
            lst1.add(result[i]);
        }
        for(int[] a : lst1){
            lst2.add(a[0]);
            lst3.add(a[1]);
        }
        for(int a : lst3){
            if(!lst2.contains(a)){
                out = 1;
            }
        }
        System.out.println(out);
    }
}
