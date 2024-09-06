package interview;

import java.util.ArrayList;

public class SunOfStringIntegers {

    public static void main(String []args){

        String s = "7639";

        ArrayList<Integer> a = new ArrayList<Integer>();
        // [1,2,3,4]
        char []ch = new char[s.length()];

        ch = s.toCharArray();

        for(char i : ch){
            a.add(Integer.parseInt(String.valueOf(i)));
        }

        int sum = 0;

        for(int i : a){
            sum = sum + i;
        }
        System.out.println(sum);

    }

}
