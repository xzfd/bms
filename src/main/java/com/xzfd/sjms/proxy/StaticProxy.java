package com.xzfd.sjms.proxy;

public class StaticProxy implements Person {
    Person person;

    public StaticProxy(Person person){
        this.person = person;
    }
    @Override
    public void sing(String jjy) {
        person.sing(jjy);
    }

    @Override
    public void eat(String jjy) {
        person.eat(jjy);
    }
}
