package com.sugarglider.conditional.switchcase;



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

        switch (choice){
            case 1:
                System.out.println(cal.add());
                    break;
            case 2:
                System.out.println(cal.subtract());
                    break;
            case 3:
                System.out.println(cal.multiply());
                    break;
            case 4:
                System.out.println(cal.divide());
                    break;
            default:
                System.out.println("Invalid Choice");
        }


    }
}
