package org.example;

import org.example.bean.StudentBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        StudentBean st1 = (StudentBean) applicationContext.getBean("stud1");
        System.out.println(st1);
        applicationContext.registerShutdownHook();


    }
}
