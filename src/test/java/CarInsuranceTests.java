import StepObject.CarinsPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CarInsuranceTests extends ChromeRunner {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void CarInsuranceTes1() {
        CarinsPageSteps carinsPageSteps = new CarinsPageSteps();
        carinsPageSteps.bycarinsInput()
                .nextinput();
        Assert.assertTrue(carinsPageSteps.byCarins.is(Condition.visible));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void CarInsuranceTest2() {
        CarinsPageSteps carinsPageSteps = new CarinsPageSteps();
        carinsPageSteps.bycarinsInput()
                .nextinput()
                .jeepInput()
                .runInput()
                .nextInput1()
                .nextin();
        Assert.assertFalse(carinsPageSteps.byCarins.is(Condition.visible));
        Assert.assertTrue(carinsPageSteps.NexttInput.is(Condition.visible));
    }
}
