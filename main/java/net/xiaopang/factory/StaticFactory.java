package net.xiaopang.factory;

import net.xiaopang.Course;

import java.util.HashMap;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 12:13
 **/

public class StaticFactory {
    private static HashMap<Integer, Course> map;

    static {
        map = new HashMap<Integer, Course>();
        map.put(1,new Course(10,10));
        map.put(2,new Course(20,20));
    }

    public  static Course  getCourse(Integer id){
       return map.get(id);
    }
}


