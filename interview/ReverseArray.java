package interview;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args){

        // 1 using collection but only applicable to wrapper classes or non primitive obj
        Integer[] arr = {1,2,3,4,5};
        Collections.reverse(Arrays.asList(arr));
        for(int i : arr){
            System.out.println(i);
        }

        //2- primitive and inplace
        int[] a = {1,2,3,4}; // 0,1,2,3
        int i=0;
        int j=a.length-1;
        while (i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        for(int x : a){
            System.out.println(x);
        }


    }

}
