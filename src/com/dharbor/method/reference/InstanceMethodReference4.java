package com.dharbor.method.reference;

import java.util.function.Consumer;

/*
    syntax:
    containingInstance::methodName
 */
public class InstanceMethodReference4 {

    public static void main(String[] args) {

        InstanceMethodReference4 object = new InstanceMethodReference4();

        Consumer c = (data) -> {
            System.out.println(data);
        };
        c.accept("hi");

        Consumer<String> c1 = object::consume;
        c1.accept("hi1");

        Consumer<String> c2  = new InstanceMethodReference4()::consume;


    }


    private void consume(String data){
        System.out.println(data);
    }




}
