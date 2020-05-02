package org.rsta80.solidprinciples.dip;

import org.rsta80.solidprinciples.dip.impl.UserRepository;

public class UserManager {

    /*
    public void showUser(){

        UserRepositoryWhitoutDIP userRepository = new UserRepositoryWhitoutDIP();
        User user = userRepository.getUser();
        System.out.println(user.toString());

    }*/

    /**
     * Correctly implemented Depency Inversion Principle
     */
    public void showUser(){

        UserRepository userRepository = UserFactory.create();
        User user = userRepository.getUser();
        System.out.println(user.toString());

    }

}
