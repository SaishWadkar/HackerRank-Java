package commonInterviewQuestions;

import java.util.HashMap;

public class CountCharOccurence {
    public static void main(String[] args){

        String s = "Saish Wadkar";
        HashMap<Character,Integer> hm = new HashMap();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '){
                continue;
            }
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }

        System.out.println(hm);

    }

}
