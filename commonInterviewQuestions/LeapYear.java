package commonInterviewQuestions;

public class LeapYear {

    public static void main(String []args){

        int year = 2024;

        Boolean result = checkLeapYear(year);
        System.out.println("Leap Year : "+result);

    }

    private static Boolean checkLeapYear(int year) {

        if(year%4==0 && year%100!=0 || year%400==0 ){
            return true;
        }
        return false;
    }
}
