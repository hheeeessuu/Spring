package com.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EchoBeanBeforeAspect {
	
	@Pointcut("execution(* sayEcho*(..))")
	public void xyz() {}
	
	// 가독성이 높지않다 하지만 재사용성이 좋다.
	@Before("xyz()")
	public void sayEchoBefore(JoinPoint point) {
		String methodName = point.getSignature().getName();
		System.out.println("sayEchoBefore" + " "+methodName);
		
	}
	
	// target object에 sayEcho로 시작하는 메서드 호출시
	// , 호출전(before advice)에  aspect가 위빙된다.
	// 가독성이 높다.
	@Before("execution(* kkkk*(..))")
	public void sayEchoBefore2() {
		System.out.println("sayEchoBefore");
	}
}
