package javaInterviewQuestions;

public class C16_ReversedNumber {
    public static void main(String[] args) {
        int num = 1234;
        int revNum = 0;
        while(num!=0){
            int n = num%10;
            revNum = revNum*10 + n;
            num = num/10;
        }
        System.out.println("reversed number is " + revNum);
    }
}
