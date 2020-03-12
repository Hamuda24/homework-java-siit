package tema;

import java.util.Scanner;

public class Exercitiu11 {
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int numDaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                numDaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numDaysInMonth = 29;
                } else {
                    numDaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                numDaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                numDaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                numDaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                numDaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                numDaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                numDaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                numDaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                numDaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                numDaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                numDaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + numDaysInMonth + " days\n");
    }
}

