package com.company;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int dayOfTheWeekNumber = 0;
        try{
            System.out.println("Please, enter day of week: ");
            dayOfTheWeekNumber = myScanner.nextInt();
        }catch (Exception eh){
            System.out.println("This is not a valid number!");
            eh.printStackTrace();
        }

        String dayOfTheWeekEnding = "";
        String dayOftheWeek = "";

        boolean isValidDay = true;
        switch (dayOfTheWeekNumber) {
            case 1:
                dayOfTheWeekEnding = "nd";
                dayOftheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeekEnding = "tu";
                dayOftheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeekEnding = "wd";
                dayOftheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeekEnding = "th";
                dayOftheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeekEnding = "fr";
                dayOftheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeekEnding = "st";
                dayOftheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeekEnding = "sn";
                dayOftheWeek = "Sunday";
                break;
            default :
                isValidDay = false;
                System.out.println("This is not a valid day of the week!");
        }

        if (isValidDay) {
            System.out.println("The " + dayOfTheWeekNumber + dayOfTheWeekEnding + " day of the week is: " + dayOftheWeek);
        }
    }
}
