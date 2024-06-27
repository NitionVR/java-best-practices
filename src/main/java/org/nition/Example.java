package org.nition;

public class Example {
    public static void main(String[] args) {
        System.out.println(greeting());
        System.out.println(getDatabasePassword());
    }

    public static String greeting(){
        return "Hello World!";
    }


    public static String getDatabasePassword() {
        return "superSecretPassword";
    }
}
