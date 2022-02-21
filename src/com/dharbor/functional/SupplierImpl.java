package com.dharbor.functional;

import java.util.function.Supplier;

public class SupplierImpl {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> String.valueOf(false);
        System.out.println(supplier.get());

        Supplier<Double> supplier1 = () -> Math.random();
        System.out.println(supplier1.get());


    }
}
