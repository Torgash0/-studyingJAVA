package mapHashCode;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
public class Test {
    public static void main(String[] args) {
        Map<User, String> test = new HashMap<>();
        User user = new User("mish", "1245l", LocalDate.of(2023, 9 ,19));
        test.put(user, "value 1");
        System.out.println(test);
        user.setPaaword("12340");
        System.out.println(user.equals(user));
        test.put(user, "value 2");
        System.out.println(user.equals(user));
        System.out.println(test);

    }
}
// проще говоря для хешмеп лучше использовать неизменяймые ключ для  обьекта
//  для практически неизменяймого обьекста существует класс record или поля должны быть final и один раз утсанавливаться в конструкторе то есть можно было сдлеать юзер неизменяймым