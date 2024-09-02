package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling1 {

    public static void main(String[] args) throws IOException {


        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int x = 10/0;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("sdsf");
        }


    }

}
