package net.xiaopang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Properties;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 00:23
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lombok {
    private Integer id;
    private String name;
    private String address;
    private Integer age;
    private Course course;
    private List<Course> list;
    private Properties properties;
}



