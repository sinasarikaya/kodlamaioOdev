package eTicaretDemo.Adepters.concretes;

import eTicaretDemo.Adepters.abstracts.Adepters;
import eTicaretDemo.entities.concretes.User;

public class GoogleAdepter implements Adepters {
    @Override
    public void signIp(User user) {
        System.out.println("Google ile kayıt olundu");
    }

    @Override
    public void signIn(User user) {
        System.out.println("Google ile giriş yapıldı");
    }
}
