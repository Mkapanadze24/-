package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CarinsPage {
    public SelenideElement byCarins = $(byText("შეიძინე ავტომობილის სრული დაზღვევა")),
    NextInput = $(byText("შეძენა")),
    JeepInput = $(byClassName("active")),
    RunInput = $(byClassName("full-casco__button--next")),
    NextInput1= $(byClassName("ng-star-inserted")),
    PriceInput = $(byClassName("ng-touched")),
    NexttInput = $(byText("შემდეგი"));


}
