package hackerRank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(System.in);

        // N - no of nos
        // 3
        int N = Integer.parseInt(br.readLine());

        List<Integer> L = new ArrayList();
        // System.out.println(N);

        // numbers
        String numbers = br.readLine(); // 1 2 3
        // System.out.println(numbers);

        String[] a = (numbers.split(" ")); //["1",2,3]

//        for(String s:a){
//            System.out.print(s);
//        }
        //L = Arrays.asList(a);

        L = Arrays.stream(a).map(s->Integer.parseInt(s)).collect(Collectors.toList()); // [1,2,3]


        if(L.size() != N){
            L = L.subList(0,N);
            // System.out.println("Changin N");
        }
        //System.out.println(L);

        // no of queries
        int Q = Integer.parseInt(br.readLine());


        for(int i=0;i<Q;i++){

            String query = br.readLine();

            if (query.equalsIgnoreCase("Insert")) {
                String params= br.readLine();
                String[] paramsArray = params.split(" ");
                List<Integer> queryList = new ArrayList();
                queryList = Arrays.stream(paramsArray).map(s->Integer.parseInt(s)).collect(Collectors.toList());

                L.add(queryList.get(0),queryList.get(1));
            } else if (query.equalsIgnoreCase("Delete")) {
                int index = Integer.parseInt(br.readLine());
                L.remove(index);
            }

        }

        L.stream().forEach(s->System.out.print(s+" "));

        // System.out.println(L);
    }
}
