package javaInterviewQuestions;

import java.util.Scanner;

public class C07_CheckNumberEvenOrOdd {
    public static void main(String[] args) {
        //Question even or odd number
        Scanner scan = new Scanner(System.in);
        System.out.print("write a num : ");
        evenOrOddMethod(scan.nextInt());
    }
    public static void evenOrOddMethod(int num){
        if(num%2==0){
            System.out.println(num + " is even(cift)");
        } else {
            System.out.println(num + " is odd(tek)");
        }
    }
}