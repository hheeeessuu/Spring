package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EchoBeanAfterAspect {
	
	@Pointcut("execution(* sayEcho*(..))")
	public void xyz() {}
	
	// 가독성이 높지않다 하지만 재사용성이 좋다.
	@After("xyz()")
	public void sayEchoAfter(JoinPoint point) {
		String methodName = point.getSignature().getName();
		System.out.println("sayEchoAfter" + " "+methodName);
		
	}
	
	// target object에 sayEcho로 시작하는 메서드 호출시
	// , 호출전(before advice)에  aspect가 위빙된다.
	// 가독성이 높다.
	@After("execution(* kkkk*(..))")
	public void sayEchoAfter2() {
		System.out.println("sayEchoBefore");
	}
}
