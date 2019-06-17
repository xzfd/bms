package com.xzfd.sjms.proxy;

import java.lang.reflect.Proxy;

public class DongTaiProxy {
    public static void main(String[] args) {
        Person p = new Student();
        Person proxy = (Person)Proxy.newProxyInstance(p.getClass().getClassLoader(),p.getClass().getInterfaces(),new MyInvocation(p));
        proxy.eat("小菊");
    }
}
