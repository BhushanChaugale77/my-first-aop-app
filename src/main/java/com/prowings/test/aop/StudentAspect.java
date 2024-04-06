package com.prowings.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect {

//	@Before("execution(* com.prowings.beans.Student.*(..))")
//	public void logBefore(JoinPoint joinPoint) throws Throwable{
//		
//		System.out.println(">>>>>>>>>>before advice executed!!");
//	}
//
//	@After("execution(* com.prowings.beans.Student.*(..))")
//	public void logAfter(JoinPoint joinPoint)throws Throwable {
//		
//		System.out.println(">>>>>>>>>>>After Advice Executed");
//	}
	
//	@Around("execution(* com.prowings.beans.Student.*(..))")
	@Around("within(com.prowings.beans.Student)")
	public void logBeforeAfter(ProceedingJoinPoint joinPoint)throws Throwable {
		
		System.out.println(">>BeforeAfter<<");
		Object returnedValue = joinPoint.proceed();
		
		System.out.println(returnedValue);
		System.out.println(">>BeforeAfter");
	}
	
}	
	


