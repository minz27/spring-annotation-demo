package com.stackroute;

import com.stackroute.components.AppConfig;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Using Application Context interface...");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movieA = applicationContext.getBean("movieA", Movie.class);
        System.out.println(movieA.toString());
        Movie movieB = applicationContext.getBean("movieB", Movie.class);
        System.out.println(movieB.toString());

        System.out.println(movieA == movieB);
    }
}
