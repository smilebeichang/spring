package net.xiaopang;

import java.sql.SQLOutput;
import java.util.logging.Logger;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-04 18:59
 **/
public class Hello {

    private  Log4J log4J = new Log4J();
    private Logger logger = Logger.getLogger("Hello.class");

    public static void main(String[] args) {

        System.out.println("hello maven");
        sayHello();

    }

    public  static void sayHello(){

        System.out.println("hello 快调用我1.0");

        /**
         *Smile.say();
         */
        net.xiaopang.Smile.say();

    }





}



