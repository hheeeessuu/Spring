package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EchoBeanAroundAspect {
	
	@Pointcut("execution(* sayEcho*(..))")
	public void xyz() {}
	
	@Pointcut("execution(* kkk*(..))")
	public void xyz2() {}
	
	// 가독성이 높지않다 하지만 재사용성이 좋다.
	@Around(value="xyz() || xyz2()")
	public Object sayEchoAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before >>>>>");
        Object retVal = pjp.proceed();
        System.out.println("after >>>>>" + retVal);
        return retVal;
	}

}
