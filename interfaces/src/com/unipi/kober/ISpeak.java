package com.unipi.kober;

public interface ISpeak {
    default void myMethodOne(){
        System.out.println("Default text..");
    }
    abstract void speak(String s);
}

interface IFreak {
    public void myMethodTwo();
}
class Human implements ISpeak,IFreak{
    public void myMethodOne() {
        System.out.println("Some human text..");
    }
    public void myMethodTwo() {
        System.out.println("Some other human text...");
    }
    public void speak(String s){
        System.out.println("Abstract class of Human... "+ s);
    }
}