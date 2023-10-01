package mjavith.hero.optional.orelse;

import mjavith.hero.optional.ifpresent.User;
import mjavith.hero.optional.ifpresent.UserRepository;

import java.util.ArrayList;

public class OrElseApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailServiceOrElse::sendPromotion);
    }
}
