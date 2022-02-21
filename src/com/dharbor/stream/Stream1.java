package com.dharbor.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

    /*
        what is difference between stream.count() & map.size();
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc1");
        list.add("abc3");
        list.add("");
        list.add("abc4");
        list.add("");

        System.out.println(list.stream().count() + " "+ list.size());

        list.stream().forEach( val -> System.out.println(val));

        long count = list.stream().filter( val -> val.equals("")).count();
        System.out.println("count "+count);

        boolean allMatch = list.stream().allMatch( val -> val.equals("abc1") || val.equals("abc3") || val.equals("") || val.equals("abc4"));
        System.out.println(allMatch);//if all values matches in list, then returns true.

        boolean allMatch1 = list.stream().allMatch( val -> val.equals("abc1"));
        System.out.println(allMatch1);

        boolean match = list.stream().anyMatch( val -> val.equals("abc1"));
        System.out.println(match);

        list.stream().limit(4).forEach( val -> System.out.println(val)); //index 0 - 3 values will be return

        list.stream().distinct().forEach(val -> System.out.println(val)); // duplicate values will be removed

        list.stream().map( (k) -> "Hello "+ k).forEach( val -> System.out.println(val));

        System.out.println(list.stream().noneMatch(val -> val.equals("abc6")));

        list.stream().skip(2).forEach( val -> System.out.println("value "+val)); // first 2 will be skipped

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .collect(Collectors.toList());


    }
}
