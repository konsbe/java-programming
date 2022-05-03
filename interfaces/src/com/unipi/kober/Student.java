package com.unipi.kober;

public class Student extends Object  implements ISpeak, IRaiseHand{
    @Override
    public void myMethodOne() {
        System.out.println("Not Default text..");
    }

    @Override
    public void speak(String s) {
        System.out.println("Student say " + s);
    }

    public void raiseHand() {

    }

    public void lowerHand() {

    }
}
