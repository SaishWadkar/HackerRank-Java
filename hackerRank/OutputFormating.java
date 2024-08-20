package hackerRank;
import java.util.Scanner;

public class OutputFormating {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            int space = 15 - s1.length();

            String spaces = " ".repeat(space);
            String output = s1 + spaces;
            System.out.print(output);
            String no = null;

            if(x>=10 && x<100){
                no = "0" + String.valueOf(x);
            }
            else if(x<10){
                no = "00" + String.valueOf(x);
            }
            else{
                no = String.valueOf(x);
            }

            System.out.print(no);

            System.out.println();
        }
        System.out.println("================================");

    }
}




