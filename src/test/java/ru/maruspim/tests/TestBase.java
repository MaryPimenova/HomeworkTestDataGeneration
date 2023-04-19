package ru.maruspim.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import ru.maruspim.pages.RegistrationPage;
import ru.maruspim.pages.TextBoxPage;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    TextBoxPage textBoxPage = new TextBoxPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";
    }
}