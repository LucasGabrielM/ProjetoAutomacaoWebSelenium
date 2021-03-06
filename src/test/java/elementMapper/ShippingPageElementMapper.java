package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPageElementMapper {

    @FindBy(id = "cgv")
    public WebElement boxAgreeToTheTerms;

    @FindBy(css = "p > button > span")
    public WebElement buttonProceedToCheckOut;

}
