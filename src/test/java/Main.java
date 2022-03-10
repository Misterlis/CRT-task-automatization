import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.Selectors;

import java.awt.*;


public class Main {
    String vvod1 = "crtweb.ru";

    @BeforeEach
    public void beforeAll() {
    }
    @AfterEach
    public void afterAll() {
    }
    @Test
    public void Test1() throws AWTException, InterruptedException {

        Selenide.open("https://www.google.com/", CRT.class)
                .searchvvod()
                .clicsite()
                .clicnavigation()
                .cliccontacts();
            sleep(2000);
            $(byText("Нужны разработчики? Свяжитесь с нами.")).shouldBe(visible);
            $(byText("Москва, Пресненская набережная, 12")).shouldBe(visible);
            $(byText("Тюмень, ул. Малыгина 84 к1, 7 этаж")).shouldBe(visible);
            $(byText("Поможем в подборе и поиске разработчиков")).scrollTo().shouldBe(visible);
            $(byText("Заполните бриф или оставьте заявку, либо звоните, мы пообщаемся и сами все за вас заполним.")).shouldBe(visible);

    }
}
