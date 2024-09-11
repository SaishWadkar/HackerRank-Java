package interview;

public class MasterCard{

    public static void main(String []args){

        String s = "abcd3e2ff";
        // op = abcd111e11ff
        String op ="";

        char []chArrray = s.toCharArray();

        for(char ch : chArrray){
            // System.out.println(ch);
            if (Character.isDigit(ch)){
                //
                int i=0;

                while(i<Integer.parseInt(String.valueOf(ch))) {
                    op = op + "1";
                    i++;
                }
            }
            else{
                op = op + ch;
            }
        }
        System.out.println(op);

    }

}

/*
Reference code :

public class Main {
    public static void main(String[] args) {
        String input = "abcd3e2ff";
        StringBuilder output = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // If the character is a digit, replace it with '1' repeated that many times
            if (Character.isDigit(c)) {
                int count = Character.getNumericValue(c);
                output.append("1".repeat(count));
            } else {
                // If it's not a digit, simply append the character to the output
                output.append(c);
            }
        }

        System.out.println(output.toString());
    }
}



 */