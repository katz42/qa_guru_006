package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class GitTraining {
    @Test
    void GoogleSearch () {
        // Open Google
        open("https://www.google.ru");

        // Search 'Selenide'
        $(byName("text")).setValue("Selenide").pressEnter();

        // Find Selenide
        $("html").shouldHave(text("selenide.org"));
    }
}