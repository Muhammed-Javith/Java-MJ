package mjavith.hero.optional.ifpresentorelse;

import mjavith.hero.optional.ifpresent.User;
import mjavith.hero.optional.ifpresent.UserRepository;

import java.util.ArrayList;

public class IfPresentOrElseApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailService::sendPromotion);
    }

}
