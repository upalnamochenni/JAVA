package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (i < 10) {
            int secondNum = in.nextInt();

        if (secondNum % 2 > 0 || secondNum % 2 < 0) {
            System.out.println("Not chetnoe");
        } else if (secondNum % 2 == 0) {
            System.out.println("Chetnoe");
        }
        i++;
    }
    }
    }
