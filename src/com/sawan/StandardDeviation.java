package com.sawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;

public class StandardDeviation {

    public static void main (String[] args){
        int[] values = {3,5,2,6};

        OptionalDouble mean = Arrays.stream(values).average();
        
        double sum = 0;
        for(int i: values){
            sum = sum + Math.pow(mean.getAsDouble()-i, 2);
        }

        double variation = sum/values.length;

        double sqRoot = Math.sqrt(variation);

        System.out.println(sqRoot);

    }
}
