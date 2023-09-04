package com.dharbor.method.reference;

/**
 * @Author: psaradhi
 * Created: 01-09-2023
 */
public class StaticMethodReference3 {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("it is job");
        });
        t.start();

        Thread t1 = new Thread(StaticMethodReference3::job);
        t1.start();

    }

    private static void job(){
        System.out.println("it is a job");
    }

    private static void job1(){
        System.out.println("it is a job1");
    }

}
