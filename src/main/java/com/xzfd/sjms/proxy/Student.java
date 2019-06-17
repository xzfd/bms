package com.xzfd.sjms.proxy;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Student implements Person {
    @Override
    public void sing(String jjy) {
       System.out.println(jjy + " like singging!");
    }

    @Override
    public void eat(String jjy) {
        System.out.println(jjy + " like eatting!");
    }
}
