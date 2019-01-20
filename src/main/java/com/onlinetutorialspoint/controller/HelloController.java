package com.onlinetutorialspoint.controller;

import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Decimal Number : ");
        int input = sc.nextInt();
        binaryRepresentation​​(input);
    }

    public static void binaryRepresentation​​(int n) {
        if(n==0) {
            return;
        }
        binaryRepresentation​​(n/2);
        System.out.print(n%2);
    }
}
