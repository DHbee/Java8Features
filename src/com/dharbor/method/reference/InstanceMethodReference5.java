package com.dharbor.method.reference;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/*
    syntax:
    containingInstance::methodName
 */
public class InstanceMethodReference5 {

    public static void main(String[] args) {

        InstanceMethodReference5 object = new InstanceMethodReference5();
        BiFunction<String, String, String> biFunction = object::consume;
        System.out.println(biFunction.apply("hi", "hello"));



    }

    private String consume(String data1, String data2){
        return data1 + " " + data2 + " done";
    }




}
