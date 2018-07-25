package com.company;

import java.io.File;

public class Main {

        public static void main(String[] args) {
            System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
            System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
        }
    }
