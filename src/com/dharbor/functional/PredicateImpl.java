package com.dharbor.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
   Below methods exists in Stream<T> interface
    1. filter
    2. allMatch
    3. noneMatch
    4. anyMatch

    above all methods allows functional

    Predicate contains below method

    boolean test (T t)

    Predicate means filter
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

        Stream<String> filterStream = list.stream().filter(item -> !item.equals("abc1") && !item.equals(""));
        filterStream.forEach( item -> System.out.println(item));

        boolean removed = list.removeIf(val -> val.equals("abc3"));
        System.out.println(removed);
        list.stream().forEach(item -> System.out.println(item));

    }
}
