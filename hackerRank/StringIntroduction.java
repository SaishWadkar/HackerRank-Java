package hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class StringIntroduction {

    public static void main(String []args) throws Exception{

        // 1. sum of length A and B
        // 2. A > B
        // 3. Capitzliae 1st letter og both

        // input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        System.out.println(getSumOfLenght(A,B));
        lexicographyCheck(A,B);
        makeCapitalAndJoin(A,B);



    }

    private static void makeCapitalAndJoin(String A,String B) {
        String one = A.substring(0,1).toUpperCase();
        String two = B.substring(0,1).toUpperCase();
        String result = one+A.substring(1)+" "+two+B.substring(1);
        System.out.println(result);

    }

    private static void lexicographyCheck(String A,String B) {

        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else if(A.compareTo(B)<0){
            System.out.println("No");
        }
        else{
            System.out.println("Equal");
        }
    }

    private static int getSumOfLenght(String A,String B) {

        return A.length()+B.length();

    }
}
