/*
 * All rights Reserved, Designed By DataDriver
 * Copyright: DataDriver.Inc
 * Company: Zhuo Wo Infomation Technology (ShangHai) CO.LTD
 */
package com.cglib;

import net.sf.cglib.proxy.FixedValue;

public class TargetResultFixed implements FixedValue {
    @Override
    public Object loadObject() throws Exception {
        System.out.println("锁定结果");
        Object obj = 999;
        return obj;

    }
}
