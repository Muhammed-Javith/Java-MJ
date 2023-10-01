package mjavith.hero.optional.orelsethrow;

import mjavith.hero.optional.ifpresent.User;
import mjavith.hero.optional.ifpresent.UserRepository;

import java.util.ArrayList;

public class OrElseThrowApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailServiceOrElseThrow::sendPromotion);
    }
}
