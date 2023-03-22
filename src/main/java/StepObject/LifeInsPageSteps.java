package StepObject;

import PageObject.LifePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class LifeInsPageSteps extends LifePage {

    public LifeInsPageSteps byLifeinput() {
        ByLifeIns.click();
        return this;
    }

    public LifeInsPageSteps buyInsInput() {
        BuyIns.click();
        return this;
    }
    public LifeInsPageSteps checkBoxInput(){
        Checkbox.click();
        return this;
    }

    public LifeInsPageSteps ByLifeIns() {
        ByLifeIns.click();
        return this;
    }
    public LifeInsPageSteps nextinput(){
        NextInput.click();
        return this;
    }
    @Step("Registration page need - {name}, {lastname}, {PN}, {number}, {month}, {year}")
    public LifeInsPageSteps nameInput (String name, String lastName, String PN,String number,String month, String year){
        NameInput.setValue(name).setValue(lastName).setValue(PN).setValue(number).setValue(month).setValue(year).click();
        return this;
    }
    public LifeInsPageSteps genderInput(){
        GenderInput.click();
        return this;
    }

    @Step ("When choosing a gender, you choose a  - {მდედრობითი}")
    public LifeInsPageSteps womenInput(String მდედრობითი){
        GenderInput.setValue("მდედრობითი");
        return this;
    }
    public LifeInsPageSteps backInput(){
        BackInput.shouldBe(Condition.visible).click();
        return this;
    }
}
