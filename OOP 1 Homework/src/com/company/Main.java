package com.company;

public class Main {

    public static void main(String[] args) {
		/**
		 * First you have to enter an int to specify the length of the array
		 * than you have to type in a
		 * [String (press Enter) String (press Enter) int (press Enter)] * the length of the array
		 *
		 */

		Sorter personSorter = new Sorter();

	    Person[] person = personSorter.populateArray();

	    personSorter.oldestFirstSorter(person);
	    personSorter.printOutArray(person);

        System.out.println("=======================");
	    personSorter.youngestFirstSorter(person);
	    personSorter.printOutArray(person);
    }
}
