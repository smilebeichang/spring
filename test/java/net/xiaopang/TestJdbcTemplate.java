package net.xiaopang;

import net.xiaopang.pojo.Dept;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 17:12
 **/

public class TestJdbcTemplate {
    private ApplicationContext ctx;
    private JdbcTemplate jt;

    @Before
    public void before(){
        ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        jt = (JdbcTemplate)ctx.getBean("jdbcTemplate");
    }

    @Test
    public  void select(){
        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<Dept>(Dept.class);
        List<Dept> list = jt.query("select * from sys_dept ",rowMapper);
        System.out.println(list.size());
    }

}


