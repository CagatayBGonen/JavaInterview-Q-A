package javaInterviewQuestions;

public class C09_LargestAmongThreeNumbers {
    public static void main(String[] args) {
        //Question largest and smallest numbers finding
        int x = 600;
        int y = 200;
        int z = 500;
        //1.way
        if(x>y && x>z) {
            System.out.println("x is greatest");
        }else if(y>z) {
            System.out.println("y is greatest");
        }else {
            System.out.println("z is greatest");
        }

        //2.way (nested if)
        if(x>=y) {
            if(x>=z) {
                System.out.println("x is greatest");
            }
            else {
                System.out.println("z is greatest");
            }
        }else {
            if(y>=z) {
                System.out.println("y is greatest");
            }else {
                System.out.println("z is greatest");
            }
        }


        //Smallest number
        if(x<y && x<z) {
            System.out.println("x is smallest");
        }else if(y<z) {
            System.out.println("y is smallest");
        }else {
            System.out.println("z is smallest");
        }

        //alternative
        int num1 = Math.max(x,y);
        int maxNum = Math.max(num1,z);

        int num2 = Math.min(x,y);
        int minNum = Math.min(num2,z);

        System.out.println(maxNum + " is max\n" + minNum + " is min");
    }
}
