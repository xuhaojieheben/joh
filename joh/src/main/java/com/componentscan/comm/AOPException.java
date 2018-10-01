package com.componentscan.comm;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
/* 
 * 注解方式aop spring只支持xml方式配置aop 所以需要使用aspect注解方式进行aop配置需要引用aspectjweaver和aopalliance
 * spring配置并且让其自动扫描到该注解作为aop还需要提供一个该类的bean对象(即@Component来提供)方可实现aop环绕通知
 * <!-- 自动为切面方法中匹配的方法所在的类生成代理对象。 -->
    <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
    	并和springMvc一样配置扫描包
 	<context:component-scan
 	以上不使用@Component是因为在xml配置bean对象可以设置参数修改方便
 */
@Aspect
public class AOPException {
	private static final int DEFAULT_MAX_RETRIES = -1;
	@SuppressWarnings("unused")
	private int maxRetries = DEFAULT_MAX_RETRIES;
	   private int order = 1;

	   public void setMaxRetries(int maxRetries) {
	      this.maxRetries = maxRetries;
	   }
	   
	   public int getOrder(){
	      return this.order;
	   }
	   public void setOrder(int order){
	      this.order = order;
	   }
	/*
	  * 环绕通知需要携带ProceedingJoinPoint类型的参数
	  * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
	  * 而且环绕通知必须有返回值，返回值即为目标方法的返回值
	*/
	   
	@SuppressWarnings("unused")
	@Around("execution(* *com.business.service..*.*(..))")//注解代替xml的<aop:config>配置 表示该环绕通知应用于哪个包或类
	public Object aroundMethod(ProceedingJoinPoint pjd) throws Throwable {
        //Object result = null;
        String methodName = "class:" + pjd.getTarget().getClass().getName() + " method:" + pjd.getSignature().getName(); //获取方法名称

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest(); //获取请求的URL//执行目标方法
        //环绕通知处理方法
        //int numAttempts = 0;
        Exception lockFailureException;
        //do {
           //numAttempts++;
           try { 
        	   System.out.println("环绕通知方法［ doConcurrentOperation(ProceedingJoinPoint pjp) ］............." + methodName);
               return pjd.proceed();//必须返回结果，否则controller无法获取service返回的结果（正常情况下）
           }
           catch(Exception ex) {
              lockFailureException = ex;
              throw lockFailureException;
           }
        //}
        //while(numAttempts <= this.maxRetries);
        
        //System.out.println("模拟记录报错日志:" + lockFailureException.toString());
        //return result;
	    
	}
}
