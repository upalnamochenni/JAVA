package com.company;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int numberFirst;
        int numberSecond;
        Scanner in = new Scanner(System.in);
        System.out.print("Choose mathematical operation: \"*\" or \"/\" or \"+\" or \"-\": \r");
        String operation2 = in.next();
        while (operation2.equals("*") || operation2.equals("/") || operation2.equals("-") || operation2.equals("+")) {
            if (operation2.equals("*")) {
                multiply();
                System.out.print("\n Choose mathematical operation: \"*\" or \"/\" or \"+\" or \"-\": \r");
                operation2 = in.next();
            } else if (operation2.equals("/")) {
                divide();
                System.out.print("\n Choose mathematical operation: \"*\" or \"/\" or \"+\" or \"-\": \r");
                operation2 = in.next();
            } else if (operation2.equals("+")) {
                plus();
                System.out.print("\n Choose mathematical operation: \"*\" or \"/\" or \"+\" or \"-\": \r");
                operation2 = in.next();
            } else if (operation2.equals("-")) {
                minus();
                System.out.print("\n Choose mathematical operation: \"*\" or \"/\" or \"+\" or \"-\": \r");
                operation2 = in.next();
            }

        }

    }
    static void multiply() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:  \r");
        int numberFirst = in.nextInt();
        System.out.print("Enter the second number: \r");
        int numberSecond = in.nextInt();
        System.out.print(numberFirst + "*" + numberSecond + "=" + (numberFirst * numberSecond));
    }
    static void minus() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:  \r");
        int numberFirst = in.nextInt();
        System.out.print("Enter the second number: \r");
        int numberSecond = in.nextInt();
        System.out.print(numberFirst + "-" + numberSecond + "=" + (numberFirst - numberSecond));
    }
    static void plus() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:  \r");
        int numberFirst = in.nextInt();
        System.out.print("Enter the second number: \r");
        int numberSecond = in.nextInt();
        System.out.print(numberFirst + "+" + numberSecond + "=" + (numberFirst + numberSecond));
    }
    static void divide() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:  \r");
        int numberFirst = in.nextInt();
        System.out.print("Enter the second number: \r");
        int numberSecond = in.nextInt();
        System.out.print(numberFirst + "/" + numberSecond + "=" + (numberFirst / numberSecond));
    }
}
