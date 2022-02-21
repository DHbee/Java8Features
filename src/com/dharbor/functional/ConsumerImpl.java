package com.dharbor.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
   Below methods exists in Stream<T> interface
    1. forEach
    2. consumer accept data


    above all methods allows consumer

    Consumer contains below method,

    void accept(T t)

 */
public class ConsumerImpl {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc1");
        list.add("abc3");
        list.add("");
        list.add("abc4");
        list.add("");

        list.stream().filter(item -> !item.equals("abc1") && !item.equals("")).forEach(
                (item1) -> System.out.println(item1)
        );



        Consumer consumer = (a) -> System.out.println(a);
        consumer.accept(10);


        List<String> list1 = new ArrayList<>();
        Consumer<List<String>> consumer1 = (List<String> list2) -> {
            list2.add("1");
            list2.add("2");
            list2.add("3");
            list2.add("4");
        };
        consumer1.accept(list1);

        list1.stream().forEach( val -> System.out.println(val));

    }
}
