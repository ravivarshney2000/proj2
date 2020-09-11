package main;

import derived.Derived;

public class Main {
    public static void main(String[] args) {
        //creating object of derived class
        Derived object= new Derived();
        //calling method of base class from derived class
        object.greet();
        object.display();
        //now calling method of derived class
        object.print();
    }
}
