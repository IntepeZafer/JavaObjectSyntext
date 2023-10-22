package com.zafer.methodsandclasses;

public class Musician {
    String Name;
    String Insturment;
    int Age;
    Simsons makesimsons = new Simsons("" , "" , 0);

    public Musician(String name, String insturment, int age) {
        Name = name;
        Insturment = insturment;
        Age = age;
    }
    public void makeSimsons(){
        makesimsons.name = "Jack";
        makesimsons.Job = "Software Engineer";
        makesimsons.Age = 20;
        System.out.println(makesimsons.name + " " + makesimsons.Job + " " + makesimsons.Job);
    }
    public void clickMethod(){
        makeSimsons();
    }
}
