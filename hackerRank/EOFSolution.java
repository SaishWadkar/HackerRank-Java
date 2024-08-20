package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EOFSolution {

    public static void main(String []args) throws IOException {


        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s = br.readLine();
        String s;
        int count = 1;
        while (sc.hasNextLine()){
            s = sc.nextLine();
            System.out.println(count + " " +s);
            count++;
        }
    }

}
