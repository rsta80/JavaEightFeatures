package org.rsta80.solidprinciples.dip.impl;

import org.rsta80.solidprinciples.dip.User;

public class UserRepositoryLocal implements UserRepository{

    @Override
    public User getUser(){
        return new User(1,"Andres","arst80@gmail.com");
    }

}
