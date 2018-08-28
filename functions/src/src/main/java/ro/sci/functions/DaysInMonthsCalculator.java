package ro.sci.functions;


import java.util.Scanner;

public class DaysInMonthsCalculator {

    public void days(int n) {
        if (n < 1 || n > 12) {
            System.out.println("Seriously???");
        } else {
            int month = n;
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                case 2:
                    leapYearValidation();
                    break;
                default:
                    System.out.println("31");
                    break;
            }
        }
    }

    /**
     * Function that checks if the requested number of days in february are in a leap year or not
     * 29 if leap year, 28 if not.
     */
    public void leapYearValidation() {
        boolean check = false;
        while (check == false) {
            System.out.println("Is it a leap year? Yes/No: ");
            String answer = new Scanner(System.in).nextLine();
            if (answer.compareTo("yes") == 0) {
                System.out.println("29");
                check = true;
            } else if (answer.compareTo("no") == 0) {
                System.out.println("28");
                check = true;
            } else {
                System.out.println("Input not valid. please enter only Yes or No. \n Try it again: ");
            }
        }
    }

}

