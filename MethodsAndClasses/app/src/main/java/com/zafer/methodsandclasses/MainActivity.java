package com.zafer.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Musician musician = new Musician("" , "" , 0);
    Simsons makesimsons = new Simsons("" , "" , 0);


    int s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("OnCreate Çayrıldı");

    }
    public void elementClass(){
        SetterAndGetter setterAndGetter = new SetterAndGetter("" , "" , "");
        setterAndGetter.setElementOne("elementOne");
        setterAndGetter.setElementTwo("elementTwo");
        setterAndGetter.setElementThree("elementThree");
        System.out.println(setterAndGetter.getElementOne());
        System.out.println(setterAndGetter.getElementTwo());
        System.out.println(setterAndGetter.getElementThree());
    }

    public void makeMusician(){
        musician.Name = "Zafer";
        musician.Insturment = "Guitar";
        musician.Age = 20;
        System.out.println(musician.Name + musician.Insturment + musician.Age);
    }
    public void clickMethod(View view){
        testMethod();
        makeMusician();
        makeSimsons();
        elementClass();
    }
    public void testMethod(){
        int x = 4 + 4;
        System.out.println("Value Of X " + x);
    }
    public int number(){
        return 4;
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("OnResume Metodu Çayrıldı");
        testMethod();
    }
    public void makeSimsons(){
        makesimsons.name = "Jack";
        makesimsons.Job = "Software Engineer";
        makesimsons.Age = 20;
        System.out.println(makesimsons.name + " " + makesimsons.Job + " " + makesimsons.Job);
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("OnPause Matodu Çayrıldı");
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("OnDestroy Methodu Çayrdıldı");
    }
}