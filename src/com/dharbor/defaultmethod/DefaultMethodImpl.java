package com.dharbor.defaultmethod;

public class DefaultMethodImpl implements DefaultMethodInterface {

    /*
         1. default keyword is not part of method definition
         2. method is overridden in case of default method
         3. method can't overridden in case of static method
     */

    @Override
    public void sum() {
        System.out.println("Impl - it is sum ");
    }

    public static void main(String[] args) {
        DefaultMethodImpl defaultMethod = new DefaultMethodImpl();
        defaultMethod.add();
        defaultMethod.sum();


    }
}
