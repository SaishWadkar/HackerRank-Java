package hackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

    public static void main(String[] args){

        HashMap<String,Object> hm = new HashMap<String,Object>();

        hm.put("Saish",7);
        hm.put("Swapnil",5);

        System.out.println(hm.get("Saish"));

        // hm.remove("Saish");
        //System.out.println(hm.get("Saish"));

        // HashMap to HashSet

        Set s = hm.entrySet();
        Iterator it = s.iterator();

        while (it.hasNext()){

            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }

    }

}
