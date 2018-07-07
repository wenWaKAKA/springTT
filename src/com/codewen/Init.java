package com.codewen;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ����ʵ�� BeanPostProcessor �ķǳ��򵥵����ӣ�
 * �����κ� bean �ĳ�ʼ����֮ǰ��֮������� bean �����ơ�
 * ������ڳ�ʼ�� bean ��֮ǰ��֮��ʵ�ָ����ӵ��߼���
 * ��Ϊ���������������� bean ����ĺ��ô������ķ����� 
 * ��Ҳ��������⡣ֻ���Զ���һ���࣬ʵ��BeanPostProcessor�ӿھͻ��Զ���spring������Ϊ����**����bean��ʼ��ʱ������ط�����
 * Ҳ���Զ�����������û����ϸ˵�����������˳��order����
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
