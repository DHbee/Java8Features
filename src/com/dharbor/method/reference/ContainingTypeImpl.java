package com.dharbor.method.reference;

import java.util.ArrayList;
import java.util.List;

/*
    syntax:
    ContainingType::methodName
 */
public class ContainingTypeImpl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        System.out.println(list.stream().filter("abc1"::equals).count());


    }



}
