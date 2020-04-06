package net.xiaopang.factory;

import net.xiaopang.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 12:50
 **/
public class SpringFactory implements FactoryBean<Course> {
    private Integer math;
    private Integer english;


    public void setMath(Integer math) {
        this.math = math;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    @Override
    public Course getObject() throws Exception {
        Course course = new Course(math,english);
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return Course.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}



