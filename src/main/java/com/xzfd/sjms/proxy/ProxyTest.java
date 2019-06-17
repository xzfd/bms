package com.xzfd.sjms.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Person person = new Student();
        StaticProxy proxy = new StaticProxy(person);
        proxy.sing("鞠婧祎");
        proxy.eat("鞠婧祎");
    }
}
