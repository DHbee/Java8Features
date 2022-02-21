package com.dharbor.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
     It works as a container for the object of type T
 */
public class Creation {

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        Optional<String> optional2 = Optional.of("abc");
        System.out.println(optional2.get());

        System.out.println("***********************");

        Optional<String> optional3 = Optional.ofNullable(Creation.get("abc"));
        System.out.println(optional3.get());

        Optional<String> optional4 = Optional.ofNullable(Creation.get(null));
        System.out.println(optional4);

        Optional<String> optional5 = Optional.ofNullable(Creation.get(null));
      //  System.out.println(optional5.get()); //throws null pointer

        System.out.println(optional5.orElse("pqr"));

       // optional5.orElseThrow(RuntimeException::new);

        //******************************
        //List list = new ArrayList();
        //list.add("a");
        List list = null;
        Optional<List> listOptional = Optional.ofNullable(list);
        listOptional.ifPresent( l -> l.add("b")  );
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        Optional<List> listOptional2 = Optional.ofNullable(list1);
        System.out.println(listOptional2.filter(val -> val.isEmpty()));


        List list3 =  Optional.ofNullable(getList()).orElseGet(ArrayList::new);
        System.out.println(list3);

        Optional<User> user = Optional.ofNullable(getUser());

        String str = user.map(u -> u.getAddress()).map(address -> address.getStreet())
                .orElse("not specified");

        List<String> list2 = new ArrayList();
        list2.add("a");
        list2.add("b");
        list2.add("c");


        list2
                .stream()
                .filter(c -> c.length() > 4)
                .map(String::length);

        Optional<Address> optionalAdd = user.map(u -> u.getAddress());



    }

    static String get(String str){
        return str;
    }

    static List getList(){
        return null;
    }

    static User getUser(){
        return new User();
    }


}
