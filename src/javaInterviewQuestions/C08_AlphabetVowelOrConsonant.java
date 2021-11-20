package javaInterviewQuestions;

import java.util.Scanner;

public class C08_AlphabetVowelOrConsonant {
    public static void main(String[] args) {
        //Question: Check whether an alphabet is Vowel or Consonant
        // a e i o u = vowel

        Scanner scan = new Scanner(System.in);
        System.out.println("karakter giriniz : ");
        char ch = scan.next().charAt(0);
        //1.way
        vowelConsonantIfMethod(ch);
        //2.way
        vowelConsonantSwitchMethod(ch);

    }
    public static void vowelConsonantIfMethod(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");
        }
        else {
            System.out.println(ch + " is consonant");
        }
    }
    public static void vowelConsonantSwitchMethod(char ch){
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;

            default:
                System.out.println(ch + " is consonant");
                break;

        }
    }
}
