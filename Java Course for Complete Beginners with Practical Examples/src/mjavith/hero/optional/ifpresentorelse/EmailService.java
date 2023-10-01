package mjavith.hero.optional.ifpresentorelse;

import mjavith.hero.optional.ifpresent.User;

public class EmailService {

    public static void sendPromotion(User user) {
        user.getEmail().ifPresentOrElse(
                email -> System.out.println("Promotion email is sent to: " + email),
                () -> System.out.println("Promotion SMS is sent to:" + user.getPhoneNumber())
        );
    }

}
