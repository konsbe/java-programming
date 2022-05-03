package com.unipi.kober;

public class Professor {
    void acceptedPeopleWhoSpeak(IProfAccepted speaker){
//        System.out.println(speak.myMethodOne);
        speaker.speak("Indormatics");
    }
    void acceptInCourse(IProfAccepted hand){
        hand.raiseHand();
    }

}
interface IProfAccepted extends ISpeak, IRaiseHand{

}