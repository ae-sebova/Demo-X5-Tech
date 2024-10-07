package demo.x5tech.tests;

import demo.x5tech.TestBase;
import demo.x5tech.pages.components.Header;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class PageHeaderTest extends TestBase {

    @Test
    void t1() {
        step("Открываем главную страницу", () -> open(""));
        Header.checkHeaderMenuItems();
    }
}
