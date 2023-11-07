package mapHashCode;

import java.util.HashMap;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
public class Manager {
    private static Map<String, User> userMap = new HashMap<>();
    boolean addNewUser(User user) {
        if (userMap.containsKey(user.getLogin())) {
            System.out.println("Пользователь с логином " + user.getLogin() + " уже сущестует");
            return false;
        } else {
            System.out.println(user.getLogin() + "вы зарагистрировались");
            userMap.put(user.getLogin(), user);
            return true;
        }
    }
    boolean login(String login, String password) {
        if (!userMap.containsKey(login)) {
            System.out.println("пользователя с логином не сущетвует" + login);
            return false;
        } else if (userMap.get(login).getPaaword().equals(password)) {
            System.out.println(login + "вы зарегистрировались");
            return true;
        } else {
            System.out.println("вы ввели неверный логин");
            return false;
        }
    }
    boolean deleteUser(String login) {
        if(userMap.containsKey(login)) {
            userMap.remove(login);
            System.out.println("пользователь удален");
            return true;
        } else {
            System.out.println("пользователя такого не существует");
            return false;
        }
    }
    void getAllUsers() {
        System.out.println(userMap.keySet());
    }
    void  getAllUsers(String sortCriterion){
        switch (sortCriterion){
            case "login":
                Map<String, User> sortedByLoginMap = new TreeMap<>(userMap);
                //System.out.println(sortedByLoginMap);
                for (Map.Entry entry : sortedByLoginMap.entrySet()){
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
                break;
            case "date":
                UserDateComparator userDateComparator = new UserDateComparator();
                List<User> sortedByDateList = new ArrayList<>(userMap.values());
                sortedByDateList.sort(userDateComparator);
                //System.out.println(sortedByDateList);
                for (User user : sortedByDateList){
                    System.out.println(user);
                }
                break;
        }
    }
     boolean editUser(User user){
        if (!userMap.containsKey(user.getLogin())){
            System.out.println("пользователя такого не существует");
            return false;
         }else {
            userMap.put(user.getLogin(), user);
            System.out.println("пользователь с таким логином" + user.getLogin() + "успешно обновлен");
            return true;
        }
     }
}
