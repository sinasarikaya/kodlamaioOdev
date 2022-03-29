package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserCheckService {
    boolean passwordCheck(User user);
    boolean mailCheck(User user);
    boolean namesCheck(User user);
    boolean isValid(User user);
    boolean isUnusedMail(User user);


}
