package net.xiaopang.factory;

import net.xiaopang.Course;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 12:34
 **/
public class InstanceFactory {
    private Map<Integer, Course> map = new HashMap<Integer, Course>();;



    {
        map.put(3,new Course(30,30));
        map.put(4,new Course(40,40));
    }



    public   Course  getCourse(Integer id){
        return map.get(id);
    }

}



