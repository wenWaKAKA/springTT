package com.codewen;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 这是实现 BeanPostProcessor 的非常简单的例子，
 * 它在任何 bean 的初始化的之前和之后输入该 bean 的名称。
 * 你可以在初始化 bean 的之前和之后实现更复杂的逻辑，
 * 因为你有两个访问内置 bean 对象的后置处理程序的方法。 
 * 我也是这样理解。只是自定义一个类，实现BeanPostProcessor接口就会自动被spring容器视为后置**器在bean初始化时调用相关方法，
 * 也可以定义多个。但是没有详细说如何设置运行顺序order属性
 * @author WEN
 *
 */
public class Init implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("after init:"+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("before init:"+beanName);
		return bean;
	}

	
}
