package com.fulh;

import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName Log4j2DemoTest
 * @Description TODO
 * @Author fulh
 * @Date 2019/10/4 18:09
 * @Version 1.0
 */
public class Log4j2DemoTest {

    private Log4j2Demo log4j2Demo;

    @Before
    public void before(){
        log4j2Demo = new Log4j2Demo();
    }

    @Test
    public void debugLogTest(){
        log4j2Demo.debugLog();
    }

    @Test
    public void infoLogTest(){
        log4j2Demo.infoLog();
    }

    @Test
    public void warnLogTest(){
        log4j2Demo.warnLog();
    }

    @Test
    public void errorLog(){
        log4j2Demo.errorLog();
    }
}
