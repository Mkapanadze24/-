package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LifeInsurancePage {
    public static SelenideElement formeInput = $(byText("ჩემთვის"));

    public SelenideElement lifeInput = $(byText("შეიძინე სიცოცხლის დაზღვევა"));
    public SelenideElement NextInput = $(byClassName("full-casco__buttonfull-casco__button--next"));

    public  SelenideElement buyInput = $(byLinkText("შეძენა"));
    public SelenideElement OnlineInput = $("#Combined_Shape_Copy_2");

    public SelenideElement CheckboxInput = $(byClassName("Path 7219"));




}


