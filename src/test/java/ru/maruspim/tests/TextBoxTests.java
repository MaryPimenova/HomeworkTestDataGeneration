package ru.maruspim.tests;

import org.junit.jupiter.api.Test;
public class TextBoxTests extends TestBase {

    @Test
    void successfulFillFormTest() {

        textBoxPage.openPage("/text-box")
                .footerRemoving()
                .setFullName("Maria Pimenova")
                .setUserEmail("kitty@gmail.com")
                .setCurrentAddress("Baker Street, 221B")
                .setPermanentAddress("Kingsroad, Winterfell")
                .clickSubmit();

        textBoxPage.verifyOutputAppears()
                   .verifyResult("Name:","Maria Pimenova")
                   .verifyResult("Email:","kitty@gmail.com")
                   .verifyResult("Current Address :","Baker Street, 221B")
                   .verifyResult("Permananet Address :","Kingsroad, Winterfell");
    }
}
