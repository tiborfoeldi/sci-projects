package ro.sci.functions.math;

import ro.sci.functions.DayInMonth.DaysInMonthsCalculator;

import java.util.Scanner;

/**
 * Calculator utility.
 */
public class Calculator extends DaysInMonthsCalculator {

    DaysInMonthsCalculator DInM = new DaysInMonthsCalculator();
    Scanner sc = new Scanner(System.in);

    /**
     * Be advised... no exception handling, invalid input will terminate the flow
     * If number is asked try to input a number
     * If String input is needed, do so
     */


    public Calculator() {
        menu();
        boolean quit = false;
        while (!quit) {
            int choice = sc.nextInt();
            if (choice == 6 || choice == 7 || choice == 8) {
                switch (choice) {
                    case 6:
                        menu();
                        break;
                    case 7:
                        DInM.days();
                        choice();
                        break;
                    case 8:
                        quit = true;
                    break;
                }
            } else {

                System.out.print("Enter first number: ");
                int x = sc.nextInt();
                System.out.print("Enter second number: ");
                int y = sc.nextInt();
                switch (choice) {
                    case 1:
                        aduna(x, y);
                        choice();
                        break;
                    case 2:
                        substraction(x, y);
                        choice();
                        break;
                    case 3:
                        multiply(x, y);
                        choice();
                        break;
                    case 4:
                        divide(x, y);
                        choice();
                        break;
                    case 5:
                        System.out.println("Fibonacci " + x + " = " + fibonacci(x));
                        System.out.println("Fibonacci " + y + " = " + fibonacci(y));
                        choice();
                        break;
                }
            }
        }
    }

    /**
     * Function that calculates the sum of two integer numbers
     *
     * @param x
     * @param y
     * @return the sum
     */
    public int aduna(int x, int y) {
        int result = x + y;
        System.out.println(x + " + " + y + " = " + result);
        return result;
    }

    /**
     * Function that substracts an integer value from another integer value
     *
     * @param x
     * @param y
     * @return y substracted from x
     */

    public int substraction(int x, int y) {
        int result = x - y;
        System.out.println(x + " - " + y + " = " + result);
        return result;
    }

    /**
     * Function that calculates the multiplication of 2 integer values
     *
     * @param x
     * @param y
     * @return x multiplied by y
     */

    public int multiply(int x, int y) {
        int result = x * y;
        System.out.println(x + " * " + y + " = " + result);
        return result;
    }


    /**
     * Function that calculates the division of two integer values
     *
     * @param x
     * @param y
     * @return x divided by y
     */

    public double divide(int x, int y) {
        int result = x / y;
        System.out.println(x + " / " + y + " = " + result);
        return result;
    }


    /**
     * Function that calculates fibonacci sum
     *
     * @param n - the number to calculate fibonacci for
     * @return fibonacci sum
     */
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void choice() {
        System.out.print("Enter your choice: ");
    }

    public void menu() {
        System.out.print("Choose: \n 1. for addition \n 2. for substraction \n 3. for multiplication \n 4. for division \n 5. for fibonacci  \n 6. to print out menu options \n 7. to get days in month \n 8. to exit \n Enter your choice: ");
    }



}
