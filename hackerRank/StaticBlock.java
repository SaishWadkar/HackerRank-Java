package hackerRank;

import java.util.Scanner;

public class StaticBlock {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int H = sc.nextInt();

        if(B>0 && H>0){
            int area = B * H;
            System.out.println(area);
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }


    }

}
