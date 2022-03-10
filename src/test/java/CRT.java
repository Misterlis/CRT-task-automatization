import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sun.security.util.Password;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;


public class CRT extends Main {
    @FindBy(how = How.XPATH, using = "//input[@title='Поиск']")
    private SelenideElement SEARCHvvod;

    public CRT searchvvod() throws AWTException {
        SEARCHvvod.sendKeys(vvod1);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        return page(CRT.class);
    }


    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'О нас - Creative')]")
    private SelenideElement SEARCHforsite;

    public CRT clicsite() {
        SEARCHforsite.click();
        return page(CRT.class);
    }

    @FindBy(how = How.XPATH, using = "//div[@id='rec420332771']//span[2]")
    private SelenideElement navigation;

    public CRT clicnavigation() {
        navigation.click();
        return page(CRT.class);
    }

    @FindBy(how = How.XPATH, using = "//a[@class='tn-atom'][contains(text(),'Контакты')]")
    private SelenideElement contacts;

    public CRT cliccontacts() {
        contacts.click();
        return page(CRT.class);
    }


}






