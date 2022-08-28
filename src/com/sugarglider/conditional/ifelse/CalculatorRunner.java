package com.sugarglider.conditional.ifelse;


import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        int number1, number2 ,choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        number1 = scanner.nextInt();

        System.out.println("Enter number 1");
        number2 = scanner.nextInt();

        System.out.println("Enter your choice");
        choice = scanner.nextInt();

        Calculator cal = new Calculator(number1, number2);

        if (choice==1){
            System.out.println(cal.add());
        } else if (choice == 2) {
            System.out.println(cal.subtract());
        } else if (choice == 3) {
            System.out.println(cal.multiply());
        } else if (choice == 4) {
            System.out.println(cal.divide());
        }else {
            System.out.println("Invalid choice");
        }


    }
}
