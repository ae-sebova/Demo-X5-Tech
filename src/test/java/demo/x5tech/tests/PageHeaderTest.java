package demo.x5tech.tests;

import demo.x5tech.TestBase;
import demo.x5tech.pages.components.Header;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PageHeaderTest extends TestBase {

    @Test
    void t1() {
        open("");
        Header.checkHeaderMenuItems();
    }
}
