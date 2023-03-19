package StepObject;

import PageObject.LifeInsurancePage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class LifeInsurancePageSteps extends LifeInsurancePage {


    public LifeInsurancePageSteps Choseforme(){
        formeInput.click();
        return this;

    }
    public LifeInsurancePageSteps Choselife(){
        lifeInput.shouldNotBe(Condition.disappear).click();
        return this;
    }

    public LifeInsurancePageSteps ChoseBuy(){
        buyInput.click();
        return this;
    }
    public LifeInsurancePageSteps ChoseonlineIns(){
        OnlineInput.click();
        return this;
    }
    public LifeInsurancePageSteps Chosecheckbox (){
        CheckboxInput.click();
        return this;
    }

    public LifeInsurancePageSteps Chosenext() {
        NextInput.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }


    public LifeInsurancePageSteps buyInput() {
        buyInput.click();
        return this;
    }

}