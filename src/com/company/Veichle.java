package com.company;

public class Veichle {
protected String name="noname";
protected int win_id=0;


    public Veichle(String name, int win_id) {
        this.name = name;
        this.win_id = win_id;
    }
  public int run() {
        return 0;
}


    @Override
    public String toString() {
        return "Veichle{" +
                "name='" + name + '\'' +
                ", win_id=" + win_id +
                '}';
    }
    public Veichle() {
    }
}

