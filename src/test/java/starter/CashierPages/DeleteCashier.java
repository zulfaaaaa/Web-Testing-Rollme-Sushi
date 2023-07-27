package starter.CashierPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DeleteCashier extends PageObject {
    private By CashierBtn() {
        return By.xpath("/html/body/div/div/div/div[1]/ul/li[5]/a/div[1]");
    }

    // Filter
    private By filterCashierBtn() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[2]/div/button");
    }

    private By inputSearchCashier() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[3]/div/div[1]/div/div/input");
    }

    private By selectTarget() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[4]/div/div[1]/div/table/tbody/tr[5]/td[1]");
    }

    private By deleteIcon() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[4]/div/div[1]/div/table/tbody/tr[5]/td[6]/div/div/a[2]");
    }

    private By popUp() {
        return By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/button");
    }

    private By dropdown() {
        return By.xpath("//a[@class='dropdown']");
    }

    private By levelGold() {
        return By.xpath("//a[text()='Gold']");
    }

    private By levelSilver() {
        return By.xpath("//a[text()='Silver']");
    }

    private By levelBronze() {
        return By.xpath("//a[@class='dropdown-item active']");
    }


    // ============ Functional ==================
    @Step
    public void adminClickCashierMenu() {
        $(CashierBtn()).click();
    }
    @Step
    public void adminSelectTarget() {
        $(selectTarget()).click();
    }
    @Step
    public void adminClickDeleteIcon() {
        $(deleteIcon()).click();
    }
    @Step
    public void adminClickSaveButton() {
        $(popUp()).click();
    }
}