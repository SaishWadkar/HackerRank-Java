package hackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumber {
    public static void main(String[] args){

        Integer []a = {4,5,5,5,4,6,6,9,4};
        // 4-3 , 5-3, 6-2 , 9-1

        List<Integer> mylist = new ArrayList<Integer>();
        mylist = Arrays.asList(a);

        //mylist.addAll(Arrays.asList(4,5,5,5,4,6,6,9,4));


        // unique - 1
//        HashSet hs = new HashSet(mylist);
//        System.out.println(hs);

        // unique -  2
        List l1 = mylist.stream().distinct().collect(Collectors.toList());
        System.out.println(l1);

        List l2 = mylist.stream().sorted().collect(Collectors.toList());
        System.out.println(l2);

        for(Object j : l1){
            int count = (int) l2.stream().filter(i->i.equals(j)).count();
            System.out.println(j +" : "+count);
        }

        // l1.stream().map(j->l2.stream().filter(i->i.equals(j)).count()).forEach(s->System.out.print(s));
//        List l3= (List) l1.stream().map(j->l2.stream().filter(i->i.equals(j)).count());
//        System.out.println(l2);






    }

}
