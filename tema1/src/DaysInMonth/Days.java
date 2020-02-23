package DaysInMonth;

import java.util.Scanner;


public class Days {


    public static void main(String[] strings) {
        boolean run = true;
        while (run) {
            Scanner input = new Scanner(System.in);

            int numDaysInMonth = 0;
            String MonthName = "Unknown";


            System.out.print("Input a month number: ");
            int month = input.nextInt();


            System.out.print("Input a year: ");
            int year = input.nextInt();


            switch (month) {
                case 1:
                    MonthName = "January";
                    numDaysInMonth = 31;
                    break;
                case 2:
                    MonthName = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        numDaysInMonth = 29;
                    } else {
                        numDaysInMonth = 28;
                    }
                    break;
                case 3:
                    MonthName = "March";
                    numDaysInMonth = 31;
                    break;
                case 4:
                    MonthName = "April";
                    numDaysInMonth = 30;
                    break;
                case 5:
                    MonthName = "May";
                    numDaysInMonth = 31;
                    break;
                case 6:
                    MonthName = "June";
                    numDaysInMonth = 30;
                    break;
                case 7:
                    MonthName = "July";
                    numDaysInMonth = 31;
                    break;
                case 8:
                    MonthName = "August";
                    numDaysInMonth = 31;
                    break;
                case 9:
                    MonthName = "September";
                    numDaysInMonth = 30;
                    break;
                case 10:
                    MonthName = "October";
                    numDaysInMonth = 31;
                    break;
                case 11:
                    MonthName = "November";
                    numDaysInMonth = 30;
                    break;
                case 12:
                    MonthName = "December";
                    numDaysInMonth = 31;
                default:
                    System.out.println("The Month doesn't exist!Months are only 1-12");
            }
            System.out.print("Month: " + MonthName +"," + " Year: " + year + " has " + numDaysInMonth + " days\n");
        }
    }
}

