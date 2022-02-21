package com.dharbor.functional;

import java.util.ArrayList;
import java.util.List;

/*
   Below methods exists in Stream<T> interface
    1. filter
    2. allMatch
    3. noneMatch
    4. anyMatch

    above all methods allows functional

    Predicate contains below method

    boolean test (T t)
 */
public class PredicateImpl {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc1");
        list.add("abc3");
        list.add("");
        list.add("abc4");
        list.add("");

        list.stream().filter(item -> !item.equals("abc1") && !item.equals(""));

        boolean removed = list.removeIf(val -> val.equals("abc3"));
        System.out.println(removed);

    }
}
