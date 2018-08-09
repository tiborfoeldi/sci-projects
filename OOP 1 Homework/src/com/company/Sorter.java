package com.company;


import java.util.Scanner;

public class Sorter {
    Scanner intSc = new Scanner(System.in);
    Scanner stringSc = new Scanner(System.in);

    public Person[] populateArray() {
        Person[] array = new Person[intSc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Person(stringSc.nextLine(), stringSc.nextLine(), intSc.nextInt());
        }
        return array;
    }

    public void oldestFirstSorter(Person[] array) {
        boolean swapped = true;
        Person temp;
        while (swapped) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].getAge() < array[j + 1].getAge()) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public void youngestFirstSorter(Person[] array) {
        boolean swapped = true;
        Person temp;
        while (swapped) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].getAge() > array[j + 1].getAge()) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public void printOutArray(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getFirstName() + " " + persons[i].getLastName() + " " + persons[i].getAge());
        }
    }


}
