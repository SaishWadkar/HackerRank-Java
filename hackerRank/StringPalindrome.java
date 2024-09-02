package hackerRank;

public class StringPalindrome {
    public static void main(String []args){

        String original = "madam madam";

        //reverseStringUsingStringBufferPalindrome(original);

        traditionalWay(original);


    }

    private static void traditionalWay(String original) {

        char []s1 = original.toCharArray();

        char []s2 = new char[s1.length];

        for(int i= original.length()-1,j=0;i>=0;i--,j++){
            s2[j] = s1[i];
            // System.out.println(s2[j]);
        }

        String reverse = new String(s2);

        System.out.println(original);
        System.out.println(reverse);

        String ans = original.equals(reverse) ? "Yes" : "No";

        System.out.println(ans);

    }

    private static void reverseStringUsingStringBufferPalindrome(String original) {

        StringBuffer sb = new StringBuffer(original);
        String reversed = sb.reverse().toString();

        System.out.println(original);
        System.out.println(sb);
        System.out.println(reversed);

        System.out.println(original.equals(reversed));
        String ans = original.equals(reversed) ? "Yes" : "No";

        System.out.println(ans);

    }
}
