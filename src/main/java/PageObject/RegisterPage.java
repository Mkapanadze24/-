package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public SelenideElement LoginInput = $(byText("შესვლა"));
    public static SelenideElement emailOrPNInput = $(".health__form-input");
    public SelenideElement registrationInput = $(byText("რეგისტრაცია")),
    PNnumber = $(byClassName("health__form-input"),0),
    Next =$(byClassName("health__button--next")),
   Error = $(byClassName("health__form-error"));
}