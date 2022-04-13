package com.NormalJavaPractise;

public class StringDemo {
    public static void main(String[] args) {

        //String :- (Immutable)
        //------------------------
        String string = new String("Hello");
        string.concat(" Welcome");

        //-> still pointing to old String object Hello
        System.out.println("Old String Object: " + string);


        //Hence, making it refer to newly created String Object 'Hello Welcome' explicitly
        string = string.concat(" Welcome");

        //-> now pointing to newly created String Object
        System.out.println("New String Object: " + string);

        //StringBuffer :- (Thread Safe & Synchronized) - (Mutable)
        //--------------------------------------------------------
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Welcome");
        System.out.println("StringBuffer: " + sb);

        //StringBuilder :- (Not Thread Safe & Not-Synchronized) - (Mutable)
        //-----------------------------------------------------------------
        StringBuilder sbl = new StringBuilder("Hello");
        sbl.append(" Welcome");
        System.out.println("StringBuilder: " + sbl);


    }
}
