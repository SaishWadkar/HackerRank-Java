package interview;

class Teams{

}

class Department{

    Teams east = new Teams();
    Teams west = new Teams();
    Teams south = new Teams();

}

class Phy extends Department{

}

class Sky extends Department{

}

public class Games24 {

    public static void main(String[] args){

        Phy p = new Phy();
        Sky s = new Sky();

    }

}
