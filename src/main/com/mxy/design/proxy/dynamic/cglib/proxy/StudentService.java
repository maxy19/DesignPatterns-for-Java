package com.mxy.design.proxy.dynamic.cglib.proxy;

public class StudentService {

    public StudentService() {
        //CGLIB动态代理通过反射会调用这个方法
        System.out.println("studentService===>基类类构造方法");
    }

    public StudentService(String str) {
        //避免与当通过代理初始化对象空构造时候打印内容混淆
    }

    public void save() {
        System.out.println("保存ing");
    }

    public void delete() {
        System.out.println("删除ing");
    }
}
