package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface VerificationService {
    void sendMailForVerification(User user);
    void verifyMail(User user);
    boolean isVerificated(String email);

}
