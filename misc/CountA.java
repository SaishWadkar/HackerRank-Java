package misc;

import java.util.ArrayList;
import java.util.Iterator;

public class CountA {
    public static void main(String []args){

        ArrayList<String> singerNames = new ArrayList<String>();
        singerNames.add("Abhijeet Bhattacharya");
        singerNames.add("Alka Yaganik");
        singerNames.add("Udit Narayan");
        singerNames.add("Anu Malik");
        singerNames.add("Kumar Sanu");

        int count = 0;

        // 1 using for loop

//        for(int i=0;i<singerNames.size();i++){
//            if (singerNames.get(i).startsWith("A"))
//                count++;
//        }

        // 2 using iterator
//        Iterator<String> it = singerNames.iterator();
//
//        while(it.hasNext()){
//            if (it.next().startsWith("A"))
//                count++;
//
//        }

        // 3 using streams
        count = (int) singerNames.stream().filter(s->s.startsWith("A")).count();

        System.out.println("Count : "+count);
    }
}
