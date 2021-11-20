package javaInterviewQuestions;

public class C15_NumberOfDigits {
    public static void main(String[] args) {
        long num = 12345678l;
        int count = 0;
        while(num!=0){
            num = num/10;
            ++count;
        }
        System.out.println("number of digits: " + count);
    }
}
