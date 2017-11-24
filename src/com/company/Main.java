package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World"); // prints Hello World
        Veichle v=new Veichle("name1", 222 );
        System.out.println(v.toString());
        Car c=new Car("livery");
        System.out.println(c.toString());
        Veichle m=new Car("name2");
        Veichle d=new Truck();
        System.out.println(m.run());
        System.out.println(d.run());
    }

}
