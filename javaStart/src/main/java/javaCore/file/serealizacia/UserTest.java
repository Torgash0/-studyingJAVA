package javaCore.file.serealizacia;

import java.io.*;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("test");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/gaydaev/IdeaProjects/study/src/main/java/file/serealizacia/1.txt"))){
                oos.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/gaydaev/IdeaProjects/study/src/main/java/file/serealizacia/1.txt"))){
            User user2 = (User) ois.readObject();
            System.out.println(user2);
            System.out.println(user.equals(user2));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}