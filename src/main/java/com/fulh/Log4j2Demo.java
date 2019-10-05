package com.fulh;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName Log4j2Demo
 * @Description Log4j2 测试类
 * 1、引入Log4j2 的依赖文件，一般需要两个依赖log4j-core和log4j-api
 * 2、在resources目录下提供配置文件log4j2.xml,配置案例见：http://logging.apache.org/log4j/2.x/manual/configuration.html
 * 3、写测试类
 * 总结：Log4j 是Apache 提供的Java日志框架，提供了多种的日志级别输出，日志级别分别为：debug < info < warn < error
 * @Author fulh
 * @Date 2019/10/4 17:59
 * @Version 1.0
 */
public class Log4j2Demo {
    private static final Logger logger = LogManager.getLogger(Log4j2Demo.class);

    public void debugLog(){
        System.out.println("log begin...");
        logger.debug("Hello Log4j debug...");
        System.out.println("log end...");
    }

    public void infoLog(){
        System.out.println("log begin...");
        logger.info("Hello Log4j info...");
        System.out.println("log end...");
    }

    public void warnLog(){
        System.out.println("log begin...");
        logger.warn("Hello Log4j warn...");
        System.out.println("log end...");
    }

    public void errorLog(){
        System.out.println("log begin...");
        logger.error("Hello Log4j error...");
        System.out.println("log end...");
    }

}
