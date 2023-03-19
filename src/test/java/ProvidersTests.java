import StepObject.ProvidersPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProvidersTests extends ChromeRunner {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void Providers1(){
    ProvidersPageSteps providersPageSteps = new ProvidersPageSteps();
    Selenide.open("https://on.tbcinsurance.ge/main/providers");
    providersPageSteps.MainProvider();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();

    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    public void Providers2(){
        ProvidersPageSteps providersPageSteps = new ProvidersPageSteps();
        Selenide.open("https://on.tbcinsurance.ge/main/providers");
        providersPageSteps.searchInput();
        Assert.assertTrue(providersPageSteps.searchInput.is(Condition.visible));


    }
}
