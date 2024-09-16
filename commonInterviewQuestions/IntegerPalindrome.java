package commonInterviewQuestions;

public class IntegerPalindrome {

    public static void main(String []args){

        int num = 1001;
        int original = num;
        System.out.println("Original no : "+original);
        int rev =0;
        int rem =0;

        while(num!=0){
        rem = num % 10;
        rev = rev * 10 + rem;
        num = num/10;
        }
        System.out.println("Reverse no : "+rev);

        if(original == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
