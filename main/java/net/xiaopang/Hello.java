package net.xiaopang;

import java.sql.SQLOutput;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-04 18:59
 **/
public class Hello {
    public static void main(String[] args) {

        System.out.println("hello maven");
        sayHello();
    }

    public  static void sayHello(){

        System.out.println("hello 快调用我1.0");

        //Smile.say();
        net.xiaopang.Smile.say();
    }



}



