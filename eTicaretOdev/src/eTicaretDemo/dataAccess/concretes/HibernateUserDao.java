package eTicaretDemo.dataAccess.concretes;


import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> users=new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public boolean getMail(String email) {
        for(User user:users) {
            if(user.geteMail()==email) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getPassword(String password) {
        for(User user:users) {
            if(user.getPassword()==password) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
