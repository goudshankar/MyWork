package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  
  
@Aspect  
public class TrackOperation  
{  
	private static final Logger logger = LoggerFactory.getLogger(TrackOperation.class);
    @Pointcut("execution(* com.spring.*.*.*(..)) && !execution(* com.spring.*.User.*(..))")  
    public void abcPointcut(){}  
      
    @Around("abcPointcut()")  
    public Object myadvice(ProceedingJoinPoint pjp) throws Throwable   
    {  
    	logger.info("Before calling actual method {} , Class name {} argument {}",pjp.getSignature().getName(),pjp.getTarget().getClass().getName(),pjp.getArgs());
    	long before=System.currentTimeMillis();
        Object obj=pjp.proceed();  
        
        long after=System.currentTimeMillis()-before;
        logger.info("After calling actual method {} , Class name {} execution time is : {}",pjp.getSignature().getName(),pjp.getTarget().getClass().getName(), after);  
        return obj;  
    }  
    
/*    @Before("abcPointcut()")  
    public void myadvice(JoinPoint pjp) throws Throwable   
    {  
    	logger.info("Before calling actual method {} , Class name {}",pjp.getSignature().getName(),pjp.getTarget().getClass().getName());
    }
    
    @Before("abcPointcut()")  
    public void after(JoinPoint pjp) throws Throwable   
    {  
        logger.info("After calling actual method {} , Class name {}",pjp.getSignature().getName(),pjp.getTarget().getClass().getName());  
    }*/
} 