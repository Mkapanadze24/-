package StepObject;

import PageObject.CarinsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class CarinsPageSteps extends CarinsPage {
    public CarinsPageSteps bycarinsInput(){
        byCarins.click();
        return this;
    }
    public CarinsPageSteps nextinput(){
        NextInput.shouldBe(Condition.visible).click();
        return this;
    }
    public CarinsPageSteps jeepInput(){
        JeepInput.sendKeys("ENTER");
        return this;
    }

    public CarinsPageSteps runInput(){
        RunInput.click();
        return this;
    }

    public CarinsPageSteps nextInput1(){
        NextInput1.click();
        return this;
    }
    @Step ("Price input is - {5000}")
    public CarinsPageSteps priceInput(int price){
        PriceInput.setValue("5000");
        return this;
    }
    public CarinsPageSteps nextin(){
        NexttInput.click();
        return this;
    }
}
