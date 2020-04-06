package net.xiaopang.service.impl;

import net.xiaopang.service.AnnotionServiceI;
import org.apache.ibatis.cache.TransactionalCacheManager;
import org.apache.log4j.Logger;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 13:10
 **/
@Service
public class AnnotionServiceImpl implements AnnotionServiceI {
    private DataSourceTransactionManager dataSourceTransactionManager;

    @Override
    @Transactional
    public void select() {
        try {
            Logger logger =  Logger.getLogger("AnnotionServiceImpl.class");
            logger.error("注解配置");
            int i =1/0;
            //事务的原子性一定得对数据库进行操作吗？
            logger.error("注解配置");
        } catch (Exception e) {
            e.printStackTrace();
            //dataSourceTransactionManager.rollback();
        }
    }

    @Override
    public String add(String id) {
        //int i = 1/0;
        return "有返回值的add()"+id;
    }
}


