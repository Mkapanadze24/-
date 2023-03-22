import StepObject.LifeInsPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LifeInsuranceTests extends ChromeRunner {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void lifeInsurance1() {
        LifeInsPageSteps lifeInsPageSteps = new LifeInsPageSteps();
        lifeInsPageSteps.byLifeinput()
                .buyInsInput()
                .checkBoxInput();
        Assert.assertFalse(lifeInsPageSteps.Checkbox.is(Condition.checked));

    }


    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void lifeInsurance2() {
        LifeInsPageSteps lifeInsPageSteps = new LifeInsPageSteps();
        lifeInsPageSteps.byLifeinput()
                .buyInsInput()
                .checkBoxInput()
                .nextinput()
                .nameInput("Mariam", "Kapanadze", "PN", "number", "month", "year")
                .backInput();
        Assert.assertFalse(lifeInsPageSteps.BackInput.is(Condition.visible));
    }
}
