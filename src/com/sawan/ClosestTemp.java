package com.sawan;

import java.util.ArrayList;
import java.util.List;

public class ClosestTemp {

    public static void main (String[]args){
        int[] vals = {-9,7,5,8,1,-5,9,6};
        int key = 4;
        int indexPos = closestTempValue(vals,key);
        if(indexPos != -1){
            System.out.println("Closest value found at index position: " + indexPos);
            System.out.println("Closest Value at index position: " + vals[indexPos]);
        }else{
            System.out.println("Some error");
        }
    }

    private static int closestTempValue(int[] vals, int closestTo){
        int retIndex = -1;
        int closestVal = 24254336;
        List<Integer> list = new ArrayList();
        for (int i=0;i<vals.length;i++) {
            int v = vals[i];
            if(v<0){
                v = v *-1;
            }
            int distanceFromKey;
            if(v>closestTo){
                distanceFromKey = v - closestTo;
            }else{
                distanceFromKey = closestTo - v;
            }

            if(closestVal > distanceFromKey){
                closestVal = distanceFromKey;
                list = new ArrayList();
                list.add(i);
            }else if(closestVal == distanceFromKey){
                list.add(i);
            }
        }

        if(list.size()>1){
            if(vals[list.get(0)] >0){
                retIndex = list.get(0);
            }else{
                retIndex = list.get(1);
            }
        }else{
            retIndex = list.get(0);
        }

        return retIndex;
    }

}
