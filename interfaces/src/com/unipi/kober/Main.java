package com.unipi.kober;

public class Main {
    public static void main (String[] args){
        Human myHuman = new Human();
        Professor p1 = new Professor();
        Student myStud = new Student();
        myHuman.myMethodOne();
        myHuman.speak("yes");
        myHuman.who("human");

        myStud.myMethodOne();
        myStud.speak("student");
        myStud.who("student");
        p1.acceptedPeopleWhoSpeak(myStud);
        p1.acceptedPeopleWhoSpeak(myHuman);
    }
}
