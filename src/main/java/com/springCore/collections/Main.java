package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employeeConfig.xml");
        Emp employee= (Emp) applicationContext.getBean("emp1");
        System.out.println(employee);
    }
}
