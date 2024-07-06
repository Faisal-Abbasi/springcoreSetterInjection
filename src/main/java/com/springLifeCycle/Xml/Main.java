package com.springLifeCycle.Xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Using abstract application context as it contains the method that is used to call the destroy method of bean life cycle
         */
        AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("LifeCycleXML.xml");
//        House house=(House) abstractApplicationContext.getBean("house");
//        System.out.println(house);
        abstractApplicationContext.registerShutdownHook();

//        System.out.println("====================================================");
//        Pepsi pepsi = (Pepsi)abstractApplicationContext.getBean("pepsi");
//        System.out.println(pepsi);

            Example example= (Example) abstractApplicationContext.getBean("example");
        System.out.println(example );

    }
}
