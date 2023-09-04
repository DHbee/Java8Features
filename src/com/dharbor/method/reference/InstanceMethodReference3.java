package com.dharbor.method.reference;

import java.util.ArrayList;
import java.util.List;

/*
    syntax:
    containingInstance::methodName
 */
public class InstanceMethodReference3 {

    public static void main(String[] args) {

        InstanceMethodReference3 object = new InstanceMethodReference3();

        Thread t = new Thread(() -> {
            System.out.println("it is job");
        });
        t.start();

        Thread t1 = new Thread(object::job);
        t1.start();


    }

    private void job(){
        System.out.println("it is a job");
    }



}
