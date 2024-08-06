package misc;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQestions {

    @Test(enabled = false)
    public void countStartWithS(){

        int count = (int) Stream.of("Saish","Swapnil","Vipul","Madhuri").filter(s->s.startsWith("S")).count();
        System.out.println("Count of starting with s : "+count);
    }

    @Test(enabled = false)
    public void countLengthGreaterthan5(){

        Stream.of("Saish","Swapnil","Vipul","Madhuri").filter(s->s.length()>5).forEach(s->System.out.println(s));
        //System.out.println("Count of length greater than 5 : "+count);
    }

    @Test(enabled = false)
    public void mapToUpeercase(){

        List<String> names = Arrays.asList("Saish","Madhuri","Swapnil","Vipul");

        ArrayList a = new ArrayList();

        // 1
        // names.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).forEach(s->a.add(s));

        // 2
        List<String> result = names.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());

        System.out.println(result.get(0));


        //System.out.println(a);

    }

    @Test
    public void intergersUniqueSort(){

        Stream s1 = Stream.of(5,3,7,2,6,7,3,9,4,2,2,2,7,8,9,9,3,2,5,1);
        //System.out.println(s1.count()); // total count

        // s1.sorted().distinct().forEach(s->System.out.println(s));
        List<Integer> l1 = (List<Integer>) s1.distinct().sorted().collect(Collectors.toList());
        System.out.println(l1);

        //List<Integer> distinctNumbers = s1.distinct().collect(Collectors.toList());


    }

}
