package com.dharbor.functional;

import java.util.function.Function;


public class FunctionImpl {


    /*
        R apply(T)

        it is setter & getter together
     */

    public static void main(String[] args) {
        Function<String, Integer> function1 = (a) -> Integer.parseInt(a);
        System.out.println(function1.apply("10"));

    }

}
