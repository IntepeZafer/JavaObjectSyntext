package com.zafer.methodsandclasses;

public class chilSimsons extends Simsons{

    public chilSimsons(String name, String job, int age) {
        super(name, job, age);
        name = "Holmes";
        job = "Software Engineer";
        age = 20;
        System.out.println(name + job + age);
    }
}
