
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SelenideTest {

    @Test
    public void test() {
        open("https://www.dropbox.com/");
        System.out.println("got it");

    }

    @Test
    public void test1() {
        open("https://www.dropbox.com/");
        System.out.println("got it");

    }

    @AfterMethod
    public void closeDriver() {
        WebDriverRunner.closeWebDriver();
    }

}
