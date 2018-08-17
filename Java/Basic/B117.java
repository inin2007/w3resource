package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a positive integer: ");
            int n = in.nextInt();
            System.out.printf("Square root of %d is: ",n);
            System.out.println(sqrt(n));
        }

        private static int sqrt(int num) {
            if (num == 0 || num == 1) {
                return num;
            }
            int a = 0;
            int b = num;
            while (a <= b) {
                int mid = (a + b) >> 1;
                if (num / mid < mid) {
                    b = mid - 1;
                } else {
                    if (num / (mid + 1) <= mid) {
                        return mid;
                    }
                    a = mid + 1;
                }
            }
            return a;
        }
    }
