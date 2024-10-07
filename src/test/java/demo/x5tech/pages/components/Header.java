package demo.x5tech.pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class Header {

    private static final List<String> menuItems = List.of(
            "О нас",
            "Вакансии",
            "Мероприятия",
            "Публикации",
            "Технологии и решения",
            "Стажировка"
    );

    private static final ElementsCollection headerMenu = $$("nav[class^='HeaderDesktop_menu'] button");

    @Step("Проверяем названия пунктов меню в хедере")
    public static void checkHeaderMenuItems() {
        headerMenu.shouldHave(CollectionCondition.texts(menuItems));
    }

}
