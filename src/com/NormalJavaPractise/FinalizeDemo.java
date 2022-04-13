package com.NormalJavaPractise;

public class FinalizeDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is executed & Clean-Up is done");
    }

    public static void main(String[] args) {

        FinalizeDemo finalizeDemo = new FinalizeDemo();
        finalizeDemo = null;
        System.gc();
    }
}
