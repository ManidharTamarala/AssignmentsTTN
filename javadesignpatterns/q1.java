package com.designpatterns;

class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Singleton Class");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }
}

public class q1 {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);

    }
}
