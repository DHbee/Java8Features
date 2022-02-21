package com.dharbor.defaultmethod;

public interface DefaultMethodInterface {


    default void add(){
        System.out.println("add default method ");
    }

    default void sum(){
        System.out.println("sum default method");
    }

}
