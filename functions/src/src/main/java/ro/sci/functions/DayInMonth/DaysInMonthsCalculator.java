package ro.sci.functions.DayInMonth;

import java.util.Scanner;


public class DaysInMonthsCalculator {
    Scanner scanner = new Scanner(System.in);
    Scanner s = new Scanner(System.in);


    /**
     *  Function giving back the number of day in a month after entering the
     *  number of the month. (1 for January.... 12 for December)
     *  No Validation is addad if a number lower than 1 or higher than 12 is added
     */

    public void days() {
        System.out.println("Enter the number of the month (1 - 12):");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                leapYearValidation();
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
            String answer = s.nextLine().toLowerCase();
            if (answer.compareTo("yes") == 0 ) {
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
