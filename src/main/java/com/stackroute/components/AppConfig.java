package com.stackroute.components;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class AppConfig {
    @Bean(name = {"movieA", "movieB"})
    public Movie getMovie(){
        Movie movie = new Movie();
        return movie;
    }
    @Bean(name="actor1")
    public Actor getActor(){
        Actor actor = new Actor("George Clooney", "Male", 63);
        return actor;
    }
    @Bean
    public Actor getActor2(){
        Actor actor = new Actor("Scarlett Johanson", "Female", 40);
        return actor;
    }


}
