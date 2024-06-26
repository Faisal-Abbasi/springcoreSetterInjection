package com.springref.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("refconfiguration.xml");
        A a= (A) applicationContext.getBean("a");
        System.out.print(a);
    }
}
