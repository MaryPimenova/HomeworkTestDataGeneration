package ru.maruspim.pages;

import com.codeborne.selenide.SelenideElement;
import ru.maruspim.pages.components.ResultsOutput;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;


public class TextBoxPage {
    // Selenide elements / locator / etc
    ResultsOutput resultsOutput = new ResultsOutput();
    SelenideElement formHeaderText = $(".main-header"),
            fullNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit");

    // Actions
    public TextBoxPage openPage(String pageUrl) {
        open(pageUrl);
        formHeaderText.shouldHave(text("Text Box"));

        return this;
    }
    public TextBoxPage footerRemoving () {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public TextBoxPage setFullName(String value) {
        fullNameInput.setValue(value);

        return this;
    }
    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }
    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public TextBoxPage verifyOutputAppears() {
        resultsOutput.verifyOutputAppears();

        return this;
    }

    public TextBoxPage verifyResult(String key, String value) {
        resultsOutput.verifyResult(key, value);

        return this;
    }
}
