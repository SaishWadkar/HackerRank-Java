package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args){

        ArrayList<String> a = new ArrayList<String>();

        a.addAll(Arrays.asList("apple", "banana", "cherry", "mango", "apple"));
        System.out.println(a);

        a.remove("apple");
        System.out.println(a);

        System.out.println(a.contains("orange"));

        System.out.println(a.size());

        for(String s : a){
            System.out.print(s + " : ");
            System.out.print(a.indexOf(s));
            System.out.println();
        }

    }

}
