/*
 * All rights Reserved, Designed By DataDriver
 * Copyright: DataDriver.Inc
 * Company: Zhuo Wo Infomation Technology (ShangHai) CO.LTD
 */
package com.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TargetInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("调用前");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println(" 调用后"+result);
        return result;
    }
}
