package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    private Actor actor;

    @Autowired
    public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString()
    {
        return "Movie :" + actor;
    }
}