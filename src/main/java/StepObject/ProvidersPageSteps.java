package StepObject;

import PageObject.ProvidersPage;
import io.qameta.allure.Step;

public class ProvidersPageSteps extends ProvidersPage {

    public ProvidersPageSteps MainProvider(){
        mainprovidersInput.click();
        return this;
    }
    @Step("fill search input by value: {String}")
    public  ProvidersPageSteps SearchInput(String რეიმანი) {
      searchInput.setValue("რეიმანი").click();
        return this;
    }

    public void searchInput() {
    }
}

