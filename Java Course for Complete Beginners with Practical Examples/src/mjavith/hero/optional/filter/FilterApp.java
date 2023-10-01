package mjavith.hero.optional.filter;

import mjavith.hero.optional.ifpresent.User;
import mjavith.hero.optional.ifpresent.UserRepository;

import java.util.ArrayList;

public class FilterApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailServiceFilter::sendPromotion);
    }
}
