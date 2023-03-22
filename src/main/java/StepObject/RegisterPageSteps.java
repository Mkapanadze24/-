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
       LoginInput.click();
      return;
    }
    @Step("Email or PN is {email}" )
     public RegisterPageSteps  WriteemailOrPN (String email, String PN){
         emailOrPNInput.setValue(email).click();
        return this;
}

@Step("email or PN is {PN}")
    public RegisterPageSteps  WriteemailOrPN (String PN){
        emailOrPNInput.setValue(PN).click();
        return this;

}
     public RegisterPageSteps Registration(){
        registrationInput.click();
        return this;
     }

     @Step("PN number is {01019071824}")
     public RegisterPageSteps pnInput(){
        PNnumber.setValue("01019071824");
        return this;
     }

     public RegisterPageSteps nextorInput(){
        Next.click();
        return this;
     }
     public RegisterPageSteps errorInput(){
        Error.shouldBe(Condition.visible);
        return this;
     }
}

