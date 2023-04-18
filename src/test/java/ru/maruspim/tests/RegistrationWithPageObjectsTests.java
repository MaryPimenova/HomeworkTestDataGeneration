package ru.maruspim.tests;
import org.junit.jupiter.api.Test;
import ru.maruspim.pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationWithPageObjectsTests extends FormTestBase {


    @Test
    void successfulFillFormTest() {


        registrationPage.openPage("/automation-practice-form")
                .footerRemoving()
                .setFirstName("Maria")
                .setLastName("Pimenova")
                .setUserEmail("kitty@gmail.com")
                .setGender("Female")
                .setMobileNumber("1357924680")
                .setDate("31","December","1997")
                .setSubjects("Physics")
                .setHobby("Music")
                .uploadPicture("images/batty.jpg")
                .setCurrentAddress("Baker Street, 221B")
                .setState("Haryana")
                .setCity("Karnal")
                .clickSubmit();

        registrationPage.verifyRegistrationResultsModalAppears()
                .verifyResult("Student Name", "Maria Pimenova")
                .verifyResult("Student Email", "kitty@gmail.com")
                .verifyResult("Gender", "Female")
                .verifyResult("Mobile", "1357924680")
                .verifyResult("Date of Birth", "31 December,1997")
                .verifyResult("Subjects", "Physics")
                .verifyResult("Hobbies", "Music")
                .verifyResult("Picture", "batty.jpg")
                .verifyResult("Address", "Baker Street, 221B")
                .verifyResult("State and City", "Haryana Karnal");

    }
}
