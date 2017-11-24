package com.company;

public class Car  extends Veichle{
    String bodytype;


    public Car(String bodytype) {
        super (); //візівает конструктор парента//
        this.bodytype = bodytype;

    }
public int run(){
        return 70;
}


    @Override
    public String toString() {
        return "Car{" +
                "bodytype='" + bodytype + '\'' +
                ", name='" + name + '\'' +
                ", win_id=" + win_id +
                '}';
    }
}


