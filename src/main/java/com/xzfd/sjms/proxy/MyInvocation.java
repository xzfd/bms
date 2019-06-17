package com.xzfd.sjms.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocation implements InvocationHandler {
    Object target;

    public MyInvocation(Object obj){
        this.target = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        return method.invoke(this.target,args);
    }
}
