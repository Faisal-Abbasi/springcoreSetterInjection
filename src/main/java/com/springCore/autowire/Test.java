package com.springCore.autowire;

import com.springCore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("autowire.xml");
        Employee emp=applicationContext.getBean("employee", Employee.class);
        System.out.println(emp);

    }
}
