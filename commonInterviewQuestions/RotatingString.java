package commonInterviewQuestions;

public class RotatingString {

    public static void main(String []args){
        String s1 = "abcde";
        String s2 = "cdeab";

        System.out.println("Rotating String : "+checkStringRotation(s1,s2));

    }

    private static Boolean checkStringRotation(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            String s3 = s1 + s1;
            if(s3.indexOf(s2)>=0){
//                System.out.println(s3.indexOf(s2));
                System.out.println("Clockwise Rotation by : "+(s1.length()-s3.indexOf(s2)));
                return true;
            }
            else {
                return false;
            }
        }


    }

}
