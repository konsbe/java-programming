package com.unipi.kober;

public class Main {
    public static void main (String[] args){
        Human myHuman = new Human();
        Professor p1 = new Professor();
        Dog d1 = new Dog();
        Student myStud = new Student();
        Secretary mySecr = new Secretary();
        myHuman.myMethodOne();
        myHuman.speak("yes");
        myHuman.who("human");

        myStud.myMethodOne();
        myStud.speak("student");
        myStud.who("student");
        mySecr.who("secretary");
        d1.acceptedPeopleWhoSpeak(myStud);
        d1.acceptedPeopleWhoSpeak(myHuman);
        p1.acceptedPeopleWhoSpeak(mySecr);
    }
}
