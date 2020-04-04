package net.xiaopang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-04 23:36
 **/

public class SpringFunction {

    public static void main(String[] args) {
        //类似于new class

        //获取ioc容器
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //根据id获取bean
        //SpringTest bean = (SpringTest) ctx.getBean("xiao");
        //根据name获取bean
        //SpringTest bean1 = (SpringTest) ctx.getBean("pang");
        //根据类获取bean
        //SpringTest bean2 =  ctx.getBean(SpringTest.class);

        //lombok
        //Lombok lombok = (Lombok) ctx.getBean("list");
        //p
        Lombok  lombok = (Lombok) ctx.getBean("p");
        System.out.println(lombok);
    }


}


