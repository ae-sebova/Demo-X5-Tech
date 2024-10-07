package demo.x5tech.pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import demo.x5tech.TestBase;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class Header extends TestBase {

    private final List<String> menuItems = List.of(
            "О нас",
            "Вакансии",
            "Мероприятия",
            "Публикации",
            "Технологии и решения",
            "Стажировка"
    );

    private final ElementsCollection headerMenu = $$("nav[class^='HeaderDesktop_menu'] button");

    @Step("Проверяем названия пунктов меню в хедере")
    public void checkHeaderMenuItems() {
        headerMenu.shouldHave(CollectionCondition.texts(menuItems));
    }

}
