import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void test1() {
        open("https://ok.ru");
        User user = new User("Сим", "Sim", "password");
        MainPage mp = new MainPage();
        LoginPage lp = new LoginPage();

        lp.login(user.login, user.password);

    }
}

