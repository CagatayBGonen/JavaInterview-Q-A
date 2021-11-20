package javaInterviewQuestions;

public class C12_FactorialNumber {
    public static void main(String[] args) {
        //!5 = 5x4x3x2x1 =120
        //!4 = 4x3x2x1 = 24
        int fact01 = 1;
        for(int i = 5;i>=1;i--){
            fact01 *=i;
        }
        System.out.println(fact01);
    }
}
