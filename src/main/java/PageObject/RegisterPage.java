package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public SelenideElement LoginInput = $(byClassName("შესვლა"),0);
    public static SelenideElement emailOrPNInput = $(".შესვლა", 0);


    }
