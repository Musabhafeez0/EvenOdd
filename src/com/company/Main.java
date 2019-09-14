package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Enter any num");
    int numIs = new Scanner(System.in).nextInt();
    evenOdd(numIs);

    }
    public static void evenOdd(int num){
       ;
        if(num %2 == 0){
            System.out.println("Num is Even");
        }else {
            System.out.println("Num is odd");
        }
    }
}
