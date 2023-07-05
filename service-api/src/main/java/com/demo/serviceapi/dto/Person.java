package com.demo.serviceapi.dto;

import lombok.Data;

@Data
public class Person {

    private String name;

    private Integer age;

    private Person son;


    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(12);
        p.setName("ergouzi");
        Person pp = p;
        pp.setName("dagouzi");
        System.out.println(p);
        System.out.println(pp);
    }
}
