package javaInterviewQuestions;

import java.util.Scanner;

public class C10_LeapYear {
    public static void main(String[] args) {
        //Find Leap Year
        Scanner scan = new Scanner(System.in);
        System.out.print("yil : ");
        int year = scan.nextInt();
        leapYearMethod(year);
    }

    public static void leapYearMethod(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            }else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        if(isLeapYear){
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
