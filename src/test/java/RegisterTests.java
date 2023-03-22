import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends ChromeRunner {

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void RegisterTests1() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.loginInput();
        registerPageSteps.WriteemailOrPN("email");
        Assert.assertTrue(registerPageSteps.emailOrPNInput.is(Condition.visible));
        registerPageSteps.WriteemailOrPN("PN");
        Assert.assertTrue(registerPageSteps.emailOrPNInput.is(Condition.visible));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void RegisterTest2() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.loginInput();
        registerPageSteps.Registration()
                .pnInput()
                .nextorInput()
                .errorInput();
        Assert.assertTrue(registerPageSteps.registrationInput.isEnabled());
        Assert.assertFalse(registerPageSteps.Next.is(Condition.empty));
        Assert.assertTrue(registerPageSteps.Error.isEnabled());


    }
}

