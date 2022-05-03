package com.unipi.kober;

public class Student extends Object  implements ISpeak{
    @Override
    public void myMethodOne() {
        System.out.println("Not Default text..");
    }

    @Override
    public void speak(String s) {
        System.out.println("Student say " + s);
    }

}
