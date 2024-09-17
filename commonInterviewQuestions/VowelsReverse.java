package commonInterviewQuestions;

/*
Reverse the vowels in the strings --- umbrella -> ambrellu
u
e
a

 */

import java.util.ArrayList;

public class VowelsReverse {

    public static void main(String []args){

        String s = "umbrella";
        reverseVowelsInString(s);

    }

    private static void reverseVowelsInString(String s) {
        // lower case for consistency
        s = s.toLowerCase();

        // get all vowels
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowels.add(s.charAt(i));
            }
        }
        System.out.println("Vowels : "+vowels);


        // replace vowels in string from last vowel
        for(int i=0,j=vowels.size()-1;i<s.length() && j>=0;i++,j--) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                s = s.replace(s.charAt(i),vowels.get(j));
            }
        }

        System.out.println("Result : "+s);

        }

}
