package misc;

import org.testng.annotations.Test;

import java.util.stream.Stream;

public class StreamQestions {

    @Test(enabled = false)
    public void countStartWithS(){

        int count = (int) Stream.of("Saish","Swapnil","Vipul","Madhuri").filter(s->s.startsWith("S")).count();
        System.out.println("Count of starting with s : "+count);
    }

    @Test
    public void countLengthGreaterthan5(){

        Stream.of("Saish","Swapnil","Vipul","Madhuri").filter(s->s.length()>5).forEach(s->System.out.println(s));
        //System.out.println("Count of length greater than 5 : "+count);
    }

}
