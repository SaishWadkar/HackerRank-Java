package strings;

public class BasicString {

    public static void main(String []args){

        String name = new String("Saish");
        String name1 = new String("Saish");

        String s1 = "Swapnil";
        String s2 = "SwapnilVidhate";

        System.out.println(name);

        char initial = name.charAt(0);
        System.out.println(initial);

        char []nameArray = name.toCharArray();
        for(char c : nameArray){
            System.out.println(c);
        }


        /*
        Use == to check if two references point to the same object.
        Use .equals() to check if two strings have identical content.
         */

        System.out.println(name.equals(name1));
        System.out.println(s1.equals(s2));

        if(s1 == s2){
            System.out.println("true");
        }

        if(name == name1){
            System.out.println("true");
        }
        else {
            System.out.println("name not equal");
        }

        // Lexicography : which word comes 1st in dict
        System.out.println(s1.compareTo(s2));

        String x = "Hello world";
        String y = "World";

        // substring
        String z = x.substring(6);
        System.out.println(z);

        //region matches to check the substring
        System.out.println(x.regionMatches(true,6,y,0,4));
        name = "Vipul";
        System.out.println(name);

        // name.length();

    }

}
