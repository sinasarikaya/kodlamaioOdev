package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
    void signUp(User user);
    void signIn(User user);
}
