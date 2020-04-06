package net.xiaopang.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.Arrays;


/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-05 16:19
 **/
@Aspect
@Component
public class LogA {

    private Logger logger = Logger.getLogger(LogA.class);

    @Before(value = "execution(public void net.xiaopang.service.impl.AnnotionServiceImpl.select())")
    public void befor(JoinPoint joinPoint){
        Signature methodName = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        logger.debug("开始执行前置方法："+methodName+",参数："+ Arrays.toString(args));
    }


    //@After(value = "execution(public String net.xiaopang.service.impl.AnnotionServiceImpl.add(String))")
    @After(value = "execution(* net.xiaopang.service.impl.*.*(..))")
    public  void after(JoinPoint joinPoint){
        Signature methodName = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        logger.debug("开始执行后置方法："+methodName+",参数："+ Arrays.toString(args));
    }

    @AfterThrowing(value = "execution(* net.xiaopang.service.impl.*.*(..))",throwing = "e")
    public  void after(JoinPoint joinPoint,Throwable e){
        Signature methodName = joinPoint.getSignature();
        logger.debug("发生异常："+methodName+",异常原因："+ e);
    }
}


