package com.customer.api.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class logginadvice {

	Logger log = LoggerFactory.getLogger(logginadvice.class);

	@Pointcut(value = "execution(* com.customerApi.api.*.*.*(..))")
	public void myPointCut() {

	}

	@Around("myPointCut()")
	public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		String className = pjp.getTarget().getClass().toString();
		String methodName = pjp.getSignature().getName();
		Object[] array = pjp.getArgs();

		Object object = pjp.proceed();
		log.info(className + " " + methodName + " " + mapper.writeValueAsString(array));
		return object;
	}
}
