package net.xiaopang.factory;


import net.xiaopang.Course;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 12:17
 **/

public class TestFactory {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("TestFactory.class");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Object bean = ctx.getBean("courseFactory");
        logger.debug(bean);
        Course instanceFactory = (Course) ctx.getBean("instanceFactory");
        logger.info(instanceFactory);
        Course springFactory = (Course) ctx.getBean("springFactory");
        Course isSingleton = (Course) ctx.getBean("springFactory");
        logger.warn(springFactory);
        logger.warn(springFactory==isSingleton);
    }
}

