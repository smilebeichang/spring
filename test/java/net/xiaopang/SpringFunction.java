package net.xiaopang;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-04 23:49
 **/
public class SpringFunction {

    @Test
    public void test(){
        //获取ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据name获取bean
        SpringTest bean1 = (SpringTest) ctx.getBean("pang1");
        bean1.say();
    }

}



