package commonInterviewQuestions;

import java.util.ArrayList;

public class FibonacciSeries {
    public static void main(String []args){

        // 0,1,1,2,3,5,8,.......
        int n = 7;
        fibonacciSeries(n);
    }

    private static boolean fibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        int third;

        ArrayList<Integer> fibo = new ArrayList<Integer>();

        if(n<=0){
            System.out.println("Invalid number");
            return false;
        }
        if(n==1){
            fibo.add(first);
        } else if (n==2) {
            fibo.add(first);
            fibo.add(second);
        }
        else{
            // n =4 : 0,1,1,2
            fibo.add(first);
            fibo.add(second);
            for(int i=2;i<n;i++){
                third = first + second;
                fibo.add(third);
                first = second;
                second = third;
            }


        }


        System.out.println(fibo);

        return false;
    }
}
