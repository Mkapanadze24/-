import StepObject.LifeInsurancePageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$$;

public class LifeInsurance extends ChromeRunner {
  @Test
  @Severity(SeverityLevel.CRITICAL)
//გადადის სიცოცხლის დაზღვევის ველში, ირჩევს ყიდვას და ამოწმებს ჩექბოქსი მონიშნული არის თუ არა
    public void LifeInsuranceTest() {
      LifeInsurancePageSteps lifeInsurancePageSteps = new LifeInsurancePageSteps();
      lifeInsurancePageSteps.Choselife()
              .buyInput();
      Assert.assertFalse(lifeInsurancePageSteps.CheckboxInput.is(Condition.visible));
  }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    // გადადის სიცოცხლის დაზღვევის ველში, აწვება ჩექბოქს და  ირჩევს ღილაკს შემდეგი
    public void LifeInsuranceTest1() {
        LifeInsurancePageSteps lifeInsurancePageSteps = new LifeInsurancePageSteps();
        lifeInsurancePageSteps.Choselife()
                .Chosecheckbox()
                .Chosenext();
        Assert.assertTrue(lifeInsurancePageSteps.NextInput.is(Condition.visible));


    }
}







