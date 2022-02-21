package com.dharbor.method.reference;

import java.util.ArrayList;
import java.util.List;

/*
    syntax:
    ContainingClass::methodName.
 */
public class StaticMethodReferenceImpl {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("");
        list.add("abc4");
        list.add("");

        //list.stream().anyMatch(item -> StaticMethodReferenceImpl.isEmpty(item));
        //                 (OR)
        list.stream().anyMatch(StaticMethodReferenceImpl::isEmpty);

    }

    static boolean isEmpty(String item){
        return item.equals("");
    }

}
