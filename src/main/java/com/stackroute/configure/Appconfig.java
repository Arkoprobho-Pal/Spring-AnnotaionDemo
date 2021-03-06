package com.stackroute.configure;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.stackroute.domain.Actor;


@Configuration
public class Appconfig {

    @Bean
    public Actor getCompany()
    {
        Actor actor = new Actor();
        actor.setName("Arkoprobho");
        actor.setGender("Male");
        actor.setAge(23);
        return actor;
    }

    @Bean
    public Movie getMovie(){
        return new Movie();
    }
}
