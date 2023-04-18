package ru.maruspim.pages.components;

import com.codeborne.selenide.SelenideElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class ResultsOutput {
    // Selenide elements / locator / etc
    SelenideElement outputBox = $("#output");
    SelenideElement name = $("#name");
    // Actions
    public void verifyOutputAppears() {
        outputBox.shouldBe(visible);
    }

    public void verifyResult(String key, String value) {
       outputBox.$(byText(key)).shouldHave(text(value));
      /*  Pattern pattern = Pattern.compile(key + ".*" + ":" + value);
        System.out.println(pattern);
        Matcher matcher = pattern.matcher(......);
        System.out.println(matcher.find());*/


    }
}
