package eTicaretDemo.Adepters.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface Adepters {
    void signIp(User user);
    void signIn(User user);
}
