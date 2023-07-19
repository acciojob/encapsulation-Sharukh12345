package com.driver;

public class Main {
    private String  setName;
    private String getName;

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("John"); // Set the value of name using the setter method
        System.out.println(obj.getName()); // Retrieve the value of name using the getter metho
    }}
