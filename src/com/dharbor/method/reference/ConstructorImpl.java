package com.dharbor.method.reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*
    syntax:
    ClassName::new
 */
public class ConstructorImpl {

    ConstructorImpl(String param){
        System.out.println(param);
    }

    ConstructorImpl(){
        System.out.println("done");
    }



    public static void main(String[] args) {

        Consumer r = (param) -> {
            System.out.println(param);
        };
        r.accept("hello");

        Consumer<String> r1 = ConstructorImpl::new;
        r1.accept("hi");

        Thread t = new Thread(ConstructorImpl::new);


    }
}
