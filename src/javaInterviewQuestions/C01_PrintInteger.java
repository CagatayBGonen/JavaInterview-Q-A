package javaInterviewQuestions;
import java.util.Scanner;
public class C01_PrintInteger {
    //Question: Print an integer getting input from user
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number");
        int num = scan.nextInt();
        System.out.println("You wrote : " + num);
    }


}
