package com.atguigu.proxy.dynamicproxy;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("teacher is teaching");
    }
}
