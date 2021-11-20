package javaInterviewQuestions;

public class C23_StepsSameOrder {
    public static void main(String[] args) {
        /*
         * 1
         * 22
         * 333
         * 4444
         * 55555
         */
        for(int i = 1;i<=5;i++){
            for (int l = 1;l<=i;l++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
