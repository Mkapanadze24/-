package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProvidersPage {
    public static SelenideElement mainprovidersInput = $(byClassName("ჩემი პროვაიდერი კლინიკები"));
    public SelenideElement searchInput =$("#მოძებნე კლინიკა");
}
