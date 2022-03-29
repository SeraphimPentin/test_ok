import java.lang.constant.Constable;

public class User {

    String name;
    String login;
    String password;

    public User(String name,String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public Constable getName(String name) {
        return this.name = name;
    }
}
