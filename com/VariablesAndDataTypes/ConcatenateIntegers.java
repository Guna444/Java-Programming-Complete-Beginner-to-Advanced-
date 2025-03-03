package com.VariablesAndDataTypes;

import java.lang.*;
import java.util.*;

    class ConcatenateIntegers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            // Write Your Code to Concatenate and print
            concatenate(a,b);
        }
        public  static  void concatenate(int a, int b){
            //Complete the code below to concatenate a and b

            String ans = a+""+b;
            //Complete the code above to concatenate a and b
            System.out.println(ans);
        }
    }

