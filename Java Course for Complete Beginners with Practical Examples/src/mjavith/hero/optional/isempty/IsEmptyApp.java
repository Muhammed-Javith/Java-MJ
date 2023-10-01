package mjavith.hero.optional.isempty;

import mjavith.hero.optional.empty.FindFriendServiceEmpty;
import mjavith.hero.optional.oldway.Friend;

import java.util.Optional;
import java.util.Scanner;

public class IsEmptyApp {

    public static void main(String[] args) {

        FindFriendServiceEmpty findFriendServiceEmpty = new FindFriendServiceEmpty();
        Scanner userInput = new Scanner(System.in);

        Optional<Friend> friend = findFriendServiceEmpty.findFriend(userInput.nextLine());
        if (friend.isEmpty()) {
            System.out.println("Not found.");
        } else {
            System.out.println(friend.get());
        }

    }
}
