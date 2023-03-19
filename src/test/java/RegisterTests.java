import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends ChromeRunner {
    @Test
    @Severity(SeverityLevel.NORMAL)
    public void Registertests1() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.loginInput();
        Assert.assertFalse(registerPageSteps.LoginInput.is(Condition.visible));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void  RegisterTests2 () {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.loginInput();
        registerPageSteps.WriteemailOrPN("email","PN");
        Assert.assertTrue(registerPageSteps.LoginInput.is(Condition.visible));
    }
}

