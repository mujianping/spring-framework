package com.zlh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
//		bean.outStr();
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("context 启动成功");
// 从 context 中取出我们的 Bean，而不是用 new MessageServiceImpl() 这种方式
		MessageService messageService = context.getBean(MessageService.class);
		// 这句将输出: hello world
		System.out.println(messageService.getMessage());
	}
}
