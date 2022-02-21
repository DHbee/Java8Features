package com.dharbor.functional;

import java.util.*;

/*
   Below methods exists in Stream<T> interface
    1. forEach
    2. consumer accept data


    above all methods allows consumer

 */
public class BiConsumerImpl {

    public static void main(String[] args) {


        Map<String, String> data1 = new HashMap<>();
        data1.put("1", "one");
        data1.put("2", "two");
        data1.put("3", "three");

        data1.forEach( (k, v) -> System.out.println(k + " "+ v));

    }
}
