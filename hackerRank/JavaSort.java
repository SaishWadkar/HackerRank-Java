package hackerRank;

import java.io.BufferedReader;
import java.util.Scanner;

class Student {
    int id;
    String name;
    float cgpa;

    Student(int id,String name,float cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class JavaSort {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String input = sc.nextLine();
            System.out.println(input);
        }


    }

}
