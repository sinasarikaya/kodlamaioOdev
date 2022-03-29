package eTicaretDemo.business.concretes;

import eTicaretDemo.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class VerificationManager implements eTicaretDemo.business.abstracts.VerificationService {
    List<String> verificatedMails=new ArrayList<>();


    @Override
    public void sendMailForVerification(User user) {
        System.out.println("Doğrulama kodu gönderildi");

    }

    @Override
    public void verifyMail(User user) {
        verificatedMails.add(user.geteMail());
        System.out.println("Doğrulama yapıldı");
    }

    @Override
    public boolean isVerificated(String email) {
        if(verificatedMails.contains(email)){
            return true;
        }
        return false;
    }
}
