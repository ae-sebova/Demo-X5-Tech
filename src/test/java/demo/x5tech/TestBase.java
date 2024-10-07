package demo.x5tech;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TestBase {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://x5-tech.ru/";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
