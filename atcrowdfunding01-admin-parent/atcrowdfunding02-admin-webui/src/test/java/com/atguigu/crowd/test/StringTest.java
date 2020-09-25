package com.atguigu.crowd.test;

import  com.atguigu.crowd.util.CrowdUtil;
import org.junit.Test;

public class StringTest {
    @Test
    public void testMd5() {
        String source = "";
        String encoded = CrowdUtil.md5(source);
        System.out.println(encoded);
    }
}//4297f44b13955235245b2497399d7a93
