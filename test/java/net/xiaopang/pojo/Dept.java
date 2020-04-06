package net.xiaopang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-06 14:23
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {

    private Integer deptId;
    private String deptName;
    private String email;

}



