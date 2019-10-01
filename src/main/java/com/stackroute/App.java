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
        System.out.println("Using bean definition registry and bean definition reader...");
        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        AnnotatedBeanDefinitionReader beanDefinitionReader = new AnnotatedBeanDefinitionReader(genericApplicationContext);
        beanDefinitionReader.register(AppConfig.class);
        beanDefinitionReader.register(Actor.class);
        genericApplicationContext.refresh();
        Movie movieBeanDefinitionReader = genericApplicationContext.getBean(Movie.class);
        System.out.println(movieBeanDefinitionReader.toString());

        System.out.println("Using Application Context interface...");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = applicationContext.getBean(Movie.class);
        System.out.println(movie.toString());
    }
}
