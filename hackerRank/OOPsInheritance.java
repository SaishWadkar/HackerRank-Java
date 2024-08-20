package hackerRank;


class Arthmetic {

    public int add(int a, int b){
        return a+b;
    }
}


class Adder extends Arthmetic {

}

public class OOPsInheritance {

    public static void main(String []args){

        Adder op = new Adder();
        System.out.println("My superclass is: "+op.getClass().getSuperclass());
        System.out.println(op.add(10,20));

    }

}
