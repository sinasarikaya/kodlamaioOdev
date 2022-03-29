package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.UserCheckService;
import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.abstracts.VerificationService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {
    UserCheckService userCheckService;
    VerificationService verificationService;
    UserDao userDao;

    public UserManager(UserCheckService userCheckService,VerificationService verificationService,UserDao productDao) {
        this.userCheckService = userCheckService;
        this.verificationService=verificationService;
        this.userDao=productDao;

    }

    @Override
    public void signUp(User user) {
        if(userCheckService.isValid(user)){
            System.out.println("Kayıt olundu");
            verificationService.sendMailForVerification(user);
            userDao.add(user);
        }else{
            System.out.println("Malesef başarısız");
        }
    }

    @Override
    public void signIn(User user) {

        verificationService.verifyMail(user); // ----->> BURASI NORMALDE MAİLDE DOĞRULANACAK DİKKAT !!


        if(userDao.getMail(user.geteMail())&&userDao.getPassword(user.getPassword())&& verificationService.isVerificated(user.geteMail())==true){
            System.out.println("Giriş başarılı");
        }else if(verificationService.isVerificated(user.geteMail())==false) {
            System.out.println("Mail adresi kullanılmıyor. Lütfen mail adresinizi kontrol edin ");
        }else {
            System.out.println("Kullanıcı bilgileri hatalı lütfen kontrol edin");
        }

    }
}
