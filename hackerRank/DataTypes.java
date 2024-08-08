package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataTypes {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // byte , short , int , long

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> a = new ArrayList();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            a.add(s);
        }

        for(String s:a){
            calculate(s);
        }

    }

    private static void calculate(String s) {
        try{
            if (Byte.MIN_VALUE <= Long.parseLong(s) && Long.parseLong(s) <= Byte.MAX_VALUE) {
                System.out.println(s + " can be fitted in:" + "\n  * byte \n  * short \n  * int \n  * long");
            } else if (Short.MIN_VALUE <= Long.parseLong((s)) && Long.parseLong(s) <= Short.MAX_VALUE) {
                System.out.println(s + " can be fitted in:" + "\n  * short \n  * int \n  * long");
            } else if (Integer.MIN_VALUE <= Long.parseLong((s)) && Long.parseLong(s) <= Integer.MAX_VALUE) {
                System.out.println(s + " can be fitted in:" + "\n * int \n * long");
            } else if (Long.MIN_VALUE <= Long.parseLong((s)) && Long.parseLong(s) <= Long.MAX_VALUE) {
                System.out.println(s + " can be fitted in:" + "\n * long");
            } else {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
        catch (Exception e){
            System.out.println(s + " can't be fitted anywhere.");
        }

    }
}
