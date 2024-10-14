package hackerRank;

import java.util.*;

public class MapTelephoneNumber {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Map<String,Integer> telephoneBook = new HashMap<String,Integer>();

        int n=in.nextInt(); // take value of n , no of entries in book
        in.nextLine();  // 1st query
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            telephoneBook.put(name,phone);
            in.nextLine(); // subsequent query
        }

//        System.out.println(telephoneBook.keySet());
//
//        for(String key:telephoneBook.keySet()){
//            System.out.println(telephoneBook.get(key));
//        }

        while(in.hasNext())
        {
            String s=in.nextLine();

            if(telephoneBook.containsKey(s)){
                System.out.println(s+"="+telephoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }

        }

    }

}




