package eTicaretDemo.dataAccess.abstracts;

import eTicaretDemo.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    boolean getMail(String email);
    boolean getPassword(String password);
    List<User> getAll();

}
