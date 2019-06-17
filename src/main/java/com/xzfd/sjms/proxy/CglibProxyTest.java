package com.xzfd.sjms.proxy;

public class CglibProxyTest {
    public static void main(String[] args) {
        CglibDao c = new CglibDao();
        CglibProxy cp = new CglibProxy();
        CglibDao obj = (CglibDao)cp.getInstance(c);
        obj.delete();
    }
}
