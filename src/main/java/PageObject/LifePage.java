package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LifePage {
    public SelenideElement ByLifeIns = $(byText("შეიძინე სიცოცხლის დაზღვევა")),
    BuyIns = $(byText("შეძენა"),1),
    Checkbox = $(byClassName("critical__checkbox-icon-wrap")),
    NextInput = $(byText("შემდეგი")),
    NameInput = $(byClassName("ng-pristine"),0),
    GenderInput = $(byText("სქესი")),
    WomenInput = $(byText("მდედრობითი")),
    BackInput = $(byText("უკან"));
}
