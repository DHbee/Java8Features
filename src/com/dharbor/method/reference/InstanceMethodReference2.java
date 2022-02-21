package com.dharbor.method.reference;

import java.util.ArrayList;
import java.util.List;

/*
    syntax:
    containingInstance::methodName
 */
public class InstanceMethodReference2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("");
        list.add("abc4");
        list.add("");

        InstanceMethodReference2 instanceMethodReferenceObj = new InstanceMethodReference2();
        list.stream().anyMatch(instanceMethodReferenceObj::isEmpty);

    }

    boolean isEmpty(String item){
        return item.equals("");
    }

}
