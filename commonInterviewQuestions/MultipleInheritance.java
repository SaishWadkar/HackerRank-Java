package commonInterviewQuestions;

interface A{
    void show();
}

interface B extends A{
    void show();
}

interface C extends A{

}

interface D extends B,C{

}


public class MultipleInheritance {

    public static void main(String[] args){

    }

}
