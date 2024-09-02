package interview;

public class ExceptionHandling {

    public static void main(String[] args){

        int y = 10/0;
        try{
            int z = 10/0;

        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Inside finally block");
        }
    }

}
