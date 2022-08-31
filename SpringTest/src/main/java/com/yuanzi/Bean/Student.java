package com.yuanzi.Bean;

public class Student {
    String name;
    int age;

    public void init(){
        System.out.println("我是初始化方法!");
    }

    public Student(){
        System.out.println("我被构造了!");
    }

    public void destroy(){
        System.out.println("我是销毁方法！");
    }
}
