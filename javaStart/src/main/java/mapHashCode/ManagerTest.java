package mapHashCode;

import java.time.LocalDate;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addNewUser(new User("misha", "12345l", LocalDate.of(2020, 10 ,10)));
        manager.addNewUser(new User("misa", "1234l", LocalDate.of(2022, 11 ,1)));
        manager.addNewUser(new User("mish", "1245l", LocalDate.of(2023, 9 ,19)));
        System.out.println("\n");
        manager.login("misha", "12345l");
       //  manager.deleteUser("misha");
        manager.getAllUsers();
        manager.getAllUsers("login");
        System.out.println("\n");
        manager.getAllUsers("date");
        System.out.println("\n");
        manager.editUser(new User("mish", "1", LocalDate.now()));
        System.out.println("\n");
        manager.getAllUsers("login");
    }

}
