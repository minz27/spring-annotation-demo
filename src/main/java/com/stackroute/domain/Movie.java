package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Movie {

    private Actor actor;
    @Autowired
    @Qualifier("actor1")
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor.toString() +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("Custom init-method called");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Custom destroy-method called");
    }
}
