package com.NormalJavaPractise;

class Base {
    static void display() {
        System.out.println("Display method of Base");
    }

    public void print() {
        System.out.println("Print method of Base");
    }
}

class Derived extends Base {

    static void display() {
        System.out.println("Display method of derived");
    }

    public void print() {
        System.out.println("Print method of derived");
    }
}

public class MethodHiding {
    public static void main(String[] args) {

        Base base = new Base();
        base.display();
        base.print();

        Base base1 = new Derived();
        base1.display();
        base1.print();

        Derived derived = new Derived();
        derived.display();
        derived.print();
    }
}
