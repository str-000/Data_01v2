package com.company;

import java.util.Arrays;

public class Date {
    public Date(int day, String monthString, int year) {
        int numberOfDays;
        int monthInt;
        String monthNameString;

        String[] monthsNameArray = new String[12];
        monthsNameArray[0] = "Styczeń";
        monthsNameArray[1] = "Luty";
        monthsNameArray[2] = "Marzec";
        monthsNameArray[3] = "Kwiecień";
        monthsNameArray[4] = "Maj";
        monthsNameArray[5] = "Czerwiec";
        monthsNameArray[6] = "Lipiec";
        monthsNameArray[7] = "Sierpień";
        monthsNameArray[8] = "Wrzesień";
        monthsNameArray[9] = "Październik";
        monthsNameArray[10] = "Listopad";
        monthsNameArray[11] = "Grudzień";

        if (year % 4 == 0) {
            numberOfDays = 366;
        } else numberOfDays = 365;

        boolean isNumeric = isNumeric(monthString);
        if (isNumeric == true){
            monthInt = Integer.parseInt(monthString);
            monthNameString = monthsNameArray[monthInt-1];

            if (day > 31 || monthInt > 12) {
                System.out.println("Niepoprawna data!");
            } else {
                System.out.println( " \nDzień: " + day +
                                    " \nMiesiąc: " + monthNameString +
                                    " \nRok: " + year +
                                    " ( " + numberOfDays + " ) ");
            }
        } else {
            String monthIntOfString = String.valueOf(Arrays.asList(monthsNameArray).indexOf(monthString)+1);

            System.out.println( " \nDzień: " + day +
                                " \nMiesiąc: " + monthString + " (" + monthIntOfString + ") " +
                                " \nRok: " + year +
                                " ( " + numberOfDays + " ) ");
        }
    }

    public static boolean isNumeric(String monthString) {
        try {
            Integer.parseInt(monthString);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
