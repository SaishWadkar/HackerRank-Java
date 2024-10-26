package commonInterviewQuestions;

import java.util.ArrayList;

public class vowelConsonantCount {

    public static void main(String[] args){

        String s = "saish wadkar";
        ArrayList vowels = new ArrayList();
        ArrayList consonents = new ArrayList();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ' '){
                continue;
            }
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels.add(c);
            }
            else{
                consonents.add(c);
            }

        }
        System.out.println("Vowels : "+vowels+ " and size is : "+vowels.size());
        System.out.println("Consonents : "+consonents+" and size is : "+consonents.size());

    }

}
