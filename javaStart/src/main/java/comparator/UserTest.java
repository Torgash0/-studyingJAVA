package comparator;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("jack", 10));
        userList.add(new User("pack", 22));
        userList.add(new User("mack", 5));
        userList.add(new User("acl", 16));
        userList.add(new User("jack", 1000));
        System.out.println(userList);
        UserNameComporator userNameComporator = new UserNameComporator();
        userList.sort(userNameComporator);
        System.out.println(userList);
        UserAgeComporator userAgeComporator = new UserAgeComporator();
        userList.sort(userAgeComporator);
        System.out.println(userList);
        userList.sort(userNameComporator.thenComparing(userAgeComporator));
        System.out.println(userList);


    }
}
