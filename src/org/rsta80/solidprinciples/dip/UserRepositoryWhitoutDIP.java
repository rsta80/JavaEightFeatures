package org.rsta80.solidprinciples.dip;

public class UserRepositoryWhitoutDIP {

    public User getUser(){
        return new User(1,"Andres","arst80@gmail.com");
    }

}
