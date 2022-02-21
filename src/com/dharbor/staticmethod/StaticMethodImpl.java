package com.dharbor.staticmethod;

public class StaticMethodImpl implements StaticMethodInterface {

    /*
         1. add method can't be overridden
         2. add method can't be called using staticMethod instance inside main method
     */
    @Override
    public void sum() {
        System.out.println("it is sum");
    }

    public static void main(String[] args) {
        StaticMethodImpl staticMethod = new StaticMethodImpl();
        StaticMethodInterface.add();
    }
}
