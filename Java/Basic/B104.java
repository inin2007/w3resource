package com.company;

import java.util.Arrays;

public class Main {

        public static void main(String[] args)
        {
            int[] array_nums = {11, 15, 13, 10, 45, 20, 33, 53};
            System.out.println("Original Array: "+Arrays.toString(array_nums));

            int l = 0;
            int[] new_array;
            while(array_nums[l] != 10)
                l++;
            new_array = new int[l];
            for(int i = 0; i < l; i++)
                new_array[i] = array_nums[i];
            System.out.println("New Array: "+Arrays.toString(new_array));
        }
    }
