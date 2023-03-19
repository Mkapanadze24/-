package StepObject;

import PageObject.RegisterPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class  RegisterPageSteps extends RegisterPage {

    public   RegisterPageSteps ChoseLoginInput(){
        LoginInput.click();
        return this;
    }

    public void loginInput() {
       LoginInput.shouldBe(Condition.visible).click();
       return;
    }
    @Step("fill search input by value: {email}, {PN}" )
     public RegisterPageSteps  WriteemailOrPN (String email, String PN){
         emailOrPNInput.shouldBe(Condition.visible).click();
        return this;
}

}

