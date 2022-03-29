package eTicaretDemo;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.concretes.UserCheckManager;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.business.concretes.VerificationManager;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        // write your code here
        User sina = new User(1, "Sina", "Sarıkaya", "sinas97@gmail.com", "1231231", false);
        User ahmet = new User(1, "ahmet", "kaka", "sinas97@gmail.com", "1231231", false);
        UserService userService = new UserManager(new UserCheckManager(),new VerificationManager(),new HibernateUserDao());
        userService.signUp(sina);
    //  userService.signUp(ahmet);   GOOGLE SERVİSİ SİMÜLE EDİLDİ FAKAT İŞLEVSİZ OLDUĞU İÇİN KULLANMADIM
        userService.signIn(sina);
    }
}
