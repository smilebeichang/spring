package net.xiaopang;

import org.apache.log4j.Logger;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 11:44
 **/

public class Log4J {

    private static Logger logger = Logger.getLogger("Log4J.class");

    public static void say(){
        logger.debug("调用log4J--debug");
        logger.info("调用log4J--info");
        logger.warn("调用log4J--warn");
        logger.error("调用log4J--error");
    }

    public static void main(String[] args) {
        say();
    }
}


