package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.UserCheckService;
import eTicaretDemo.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {
    List<String> getUsersMail=new ArrayList<>();

    @Override
    public boolean passwordCheck(User user) {
        if(user.getPassword().length()>6){
            return true;
        }else if(user.getPassword().isEmpty()){
            System.out.println("Şifre boş bırakalamaz");
            return false;
        }
        else{
            System.out.println("Şifre en az 7 karakterden oluşturulabilir.");
            return false;
        }
    }

    @Override
    public boolean mailCheck(User user) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        if (user.geteMail().isEmpty()) {
            System.out.println("Email alanı boş bırakılamaz.");
            return false;
        } else {
            if (pattern.matcher(user.geteMail()).find() == false) {
                System.out.println("Girilen email adresi formata uygun değil. Örnek: ornek@ornek.com");
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean namesCheck(User user) {
        if (user.getName().length()<2 || user.getLastName().length()<2) {
            System.out.println("İsim veya soyisim en az 3 karakter olmalıdır");
            return false;
        }else if(user.getName().isEmpty() || user.getLastName().isEmpty()){
            System.out.println("İsim veya soy isim boş bırakılamaz");
            return false;
        }else {

            return true;
        }
    }

    @Override
    public boolean isValid(User user) {
        if(namesCheck(user)&&mailCheck(user)&&passwordCheck(user)&&isUnusedMail(user)==true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isUnusedMail(User user) {
        boolean result = true;
        if(getUsersMail.contains(user.geteMail())) {
            System.out.println("Bu mail adresi ile sisteme daha önce kayıt olunmuş, farklı bir mail adresi deneyiniz.");
            return false;
        }else {
            result = true;
            getUsersMail.add(user.geteMail());
        }
        return result;
    }
}
