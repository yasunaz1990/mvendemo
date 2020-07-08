package com.demo;

import com.github.javafaker.Faker;


public class JavaFakerDemo {

    // main method
    public static void main(String[] args) {

        System.out.println(  );

        Faker fakeData = new Faker();

        for (int i = 0; i < 100; i++) {
            String fakeFullName = fakeData.name().fullName();
            System.out.println(fakeFullName);
            pause();
        }
    }


    public static void pause() {
        try {
            Thread.sleep(150);
        }catch (InterruptedException e) {
            // Do nothing
        }
    }
}
