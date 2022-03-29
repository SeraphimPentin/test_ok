import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;



public class LoginPage {
    String loginWin = "st.email";
    String passwordWin = "st.password";
    String button = "//*[@id=\"anonymPageContent\"]/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/input";


    public void login(String login, String password) {
        $(By.name(loginWin)).setValue(login);
        $(By.name(passwordWin)).setValue(password);
        sleep(1000);
        $(By.xpath(button)).click();
    }
}

