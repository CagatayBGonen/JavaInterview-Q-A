package javaInterviewQuestions;

public class C22_StepsReverse {
    public static void main(String[] args) {
        /*
         * 54321
         * 5432
         * 543
         * 54
         * 5
         */
        for(int i = 1;i<=5;i++){
            for(int l = 5;l>=i;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
