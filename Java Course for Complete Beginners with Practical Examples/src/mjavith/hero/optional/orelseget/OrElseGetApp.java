package mjavith.hero.optional.orelseget;

import mjavith.hero.optional.ifpresent.User;
import mjavith.hero.optional.ifpresent.UserRepository;

import java.util.ArrayList;

public class OrElseGetApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailServiceOrElseGet::sendPromotion);
    }
}
