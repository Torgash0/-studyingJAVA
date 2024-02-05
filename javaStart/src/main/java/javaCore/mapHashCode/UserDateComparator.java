package javaCore.mapHashCode;

import java.util.Comparator;

public class UserDateComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        if (user1.getCreateData().isAfter(user2.getCreateData())){
            return 1;
        } else if (user2.getCreateData().isAfter(user1.getCreateData())){
            return -1;
        } else {
            return 0;
        }
    }
}
