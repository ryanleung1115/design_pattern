package com.atguigu.singleton.type2;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {
    private  static Singleton instance;

    private Singleton() {

    }

    static {
        instance=new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
