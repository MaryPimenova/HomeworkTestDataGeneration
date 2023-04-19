package ru.maruspim.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import ru.maruspim.pages.RegistrationPageComponent;
import ru.maruspim.pages.TextBoxPageComponent;

public class TestBase {
    RegistrationPageComponent registrationPageComponent = new RegistrationPageComponent();
    TextBoxPageComponent textBoxPageComponent = new TextBoxPageComponent();
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";
    }
}