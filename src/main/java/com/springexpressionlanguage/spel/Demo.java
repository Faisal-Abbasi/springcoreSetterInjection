package com.springexpressionlanguage.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("expressionConfig.xml");
        Test t=context.getBean("test",Test.class);
        System.out.println(t);
    }
}
