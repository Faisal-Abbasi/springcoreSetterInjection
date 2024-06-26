package org.example;

import com.spring.springcore.Student;
import org.springframework.context .ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student= (Student) context.getBean("student1");
        Student student1= (Student) context.getBean("student2");
        System.out.println("The student object from bean is "+ student1);
        System.out.println("The student object from bean is "+ student);
    }
}