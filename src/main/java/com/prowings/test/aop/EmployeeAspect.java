package com.prowings.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prowings.beans.MyLogger;


@Aspect
@Component
public class EmployeeAspect {
 
	
	@Before("execution(* com.prowings.beans.Employee.*(..))")
	public void logBefore(JoinPoint joinPoint) throws Throwable{
		
		System.out.println(">>>>>>>>>>before advice executed!!");
	}

	@After("execution(* com.prowings.beans.Employee.*(..))")
	public void logAfter(JoinPoint joinPoint)throws Throwable {
		
		System.out.println(">>>>>>>>>>>After Advice Executed");
	}
}
