package interview;

public class stringreplacebycount {

    public static void main(String[] args){

        String s = "abc3def5";
        String result = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int n = Integer.parseInt(Character.toString(ch));
                for(int j=0;j<n;j++){
                    result = result + 1;
                }
            }
            else{
                result = result + ch;
            }
        }
        System.out.println("Result : "+result);

    }

}
