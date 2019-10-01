package com.stackroute.components;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = {"movieA", "movieB"})
    @Scope(value = "prototype")
    public Movie getMovie(){
        Movie movie = new Movie(getActor());
        return movie;
    }
    @Bean
    public Actor getActor(){
        Actor actor = new Actor("George Clooney", "Male", 63);
        return actor;
    }

}
