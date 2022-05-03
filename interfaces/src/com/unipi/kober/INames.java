package com.unipi.kober;

public interface INames {
    public void firstName();
    public void middleName();
    public void lastName();
}
interface ICostas extends INames {
    default void middleName() {
        System.out.println("kostas");
    }

    default void lastName() {
        System.out.println("mits");
    }

    default void firstName(){
        System.out.println("berde");
    }
}

interface IHelen {

}