package org.rsta80.solidprinciples.dip;

import org.rsta80.solidprinciples.dip.impl.UserRepository;
import org.rsta80.solidprinciples.dip.impl.UserRepositoryLocal;

public class UserFactory {

    public static UserRepository create(){
        return new UserRepositoryLocal();
    }

}
