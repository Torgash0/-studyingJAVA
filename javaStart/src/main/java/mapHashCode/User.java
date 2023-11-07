package mapHashCode;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String login;
    private  String paaword;
    private LocalDate createData;

    public User(String login, String paaword, LocalDate createData) {
        this.login = login;
        this.paaword = paaword;
        this.createData = createData;
    }
    public User(String login){
        this.login = login;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPaaword() {
        return paaword;
    }
    public void setPaaword(String paaword) {
        this.paaword = paaword;
    }
    public LocalDate getCreateData() {
        return createData;
    }
    public void setCreateData(LocalDate createData) {
        this.createData = createData;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return paaword == user.paaword && Objects.equals(login, user.login) && Objects.equals(createData, user.createData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(login, paaword, createData);
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", paaword=" + paaword +
                ", createData=" + createData +
                '}';
    }
}

