package net.xiaopang.aspect;

import net.xiaopang.service.AnnotionServiceI;
import net.xiaopang.service.impl.AnnotionServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 16:31
 **/

public class TestLogA {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AnnotionServiceI bean =(AnnotionServiceI) ctx.getBean("annotionServiceImpl");
        bean.select();
        bean.add("23");
    }
}


