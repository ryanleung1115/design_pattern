package com.atguigu.singleton.type5;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.sayOk();
    }
}

enum Singleton{
    INSTANCE;

    public void sayOk(){
        System.out.println("ok");
    }
}