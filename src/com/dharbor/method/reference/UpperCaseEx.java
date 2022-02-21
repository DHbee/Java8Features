package com.dharbor.method.reference;

import java.util.ArrayList;
import java.util.List;

public class UpperCaseEx {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");

        list.stream().map( String::toUpperCase)
                .forEach(System.out::println);

        
    }
}
