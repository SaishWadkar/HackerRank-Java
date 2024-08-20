package hackerRank;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = a/b;
            System.out.println(ans);
        }
        catch (Exception e){
            if(e.toString().contains("For")){
                String s = e.toString().split(":")[0];
                System.out.println(s);
            }
            else{
                System.out.println(e);
            }

        }


    }

}
