package javaInterviewQuestions;

public class C17_ReverseString {
    public static void main(String[] args) {
        //for loop
        String str = "Reverse String";
        String reverseStr = "";
        for(int i = str.length()-1;i>=0;i--){
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);

        //StringBuilder
        String reverseStrBuilder = new StringBuilder(str).reverse().toString();
        System.out.println(reverseStrBuilder);

        //2.way String Builder
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        //char array
        char [] letter = {'a','d', 's'};
        int size=0;

        for (int i = letter.length-1; i>=0; i-- ) {
            System.out.println(letter[i]);
        }
    }
}
