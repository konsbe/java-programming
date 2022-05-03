package com.unipi.kober;

public class Main {
    public static void main (String[] args){
        Human myHuman = new Human();
        myHuman.myMethodOne();
        myHuman.speak("yes");
        Student myStud = new Student();
        myStud.myMethodOne();
        myStud.speak("student");
    }
}
