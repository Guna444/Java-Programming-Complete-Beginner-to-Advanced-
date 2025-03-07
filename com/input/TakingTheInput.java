package com.input;
import java.util.Scanner;
public class TakingTheInput {
    //User function Template for Java





        static void IOFunction() {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0) {

                int a = sc.nextInt();
                float b = sc.nextFloat();
                long c = sc.nextLong();
                int D = sc.nextInt();
                byte d = (byte) D;
                sc.nextLine();
                String s = sc.nextLine();

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(s);
            }

            sc.close();
        }

        static public void main(String[] args) {
            IOFunction();
        }
    }