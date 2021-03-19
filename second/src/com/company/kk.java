package com.company;

import java.util.Scanner;

public class kk {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        int firstNum = 1;
        int secondNum = in.nextInt();
        int thirdNum = in.nextInt();


        if (thirdNum > secondNum & thirdNum > firstNum) {
            System.out.println(thirdNum);
        } else if (firstNum > secondNum & firstNum > thirdNum) {
            System.out.println(firstNum);
        } else if (secondNum > thirdNum & secondNum > firstNum) {
            System.out.println(secondNum);
        }
    }
}
