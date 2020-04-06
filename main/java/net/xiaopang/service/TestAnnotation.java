package net.xiaopang.service;


import net.xiaopang.service.impl.AnnotionServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 13:12
 **/

public class TestAnnotation {
    public static void main(String[] args) {
        getByType();
    }
    public static void getByType(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AnnotionServiceI bean = (AnnotionServiceI)ctx.getBean("annotation");
        bean.select();

    }

}

