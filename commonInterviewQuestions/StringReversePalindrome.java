package commonInterviewQuestions;

public class StringReversePalindrome {

    public static void main(String []args){

        String singleWord = "madam madam";
        String multipleWord = "madam";

//        withString(multipleWord);
//        withStringBuffer(singleWord);

        enhancedPalindrome(singleWord);

    }

    private static void enhancedPalindrome(String word) {
        Boolean palindrome = true;
        for(int i=0,j=word.length()-1;i<j;i++,j--){
            if(word.charAt(i) == word.charAt(j))
            {

            }
            else {
                System.out.println("Not Palindrome");
                palindrome=false;
                break;
            }
        }
        System.out.println("Palindrome : "+palindrome);

    }

    private static void withStringBuffer(String word) {
        word = word.toLowerCase();
        StringBuffer reverse = new StringBuffer(word);
        reverse.reverse();
        System.out.println("Reversed : "+reverse);
        System.out.println("Palindrome : "+reverse.toString().equals(word));
    }

    private static void withString(String word) {
        String reverse = "";
        word = word.toLowerCase();

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("Reversed : "+reverse);
        System.out.println("Palindrome : "+word.equals(reverse));
    }

}
