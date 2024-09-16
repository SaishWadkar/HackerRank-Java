package commonInterviewQuestions;

public class PrimeNumber {

    public static void main(String []args){

        int num = 13;

        System.out.println("Number : "+num+"\nPrime Number : "+checkPrimeNumber(num));

    }

    private static Boolean checkPrimeNumber(int num) {
        // check even no : 2 is the only even prime number and smallest prime num

        if(num%2==0 && num!=2){
            return false;
        } else if (num==2) {
            return true;
        }
        else {
            for (int i=2;i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }

        }
        return true;
    }

}
