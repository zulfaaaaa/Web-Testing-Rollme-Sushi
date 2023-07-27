package starter.CashierPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AddCashier extends PageObject {
    private By CashierBtn() {
        return By.xpath("/html/body/div/div/div/div[1]/ul/li[5]/a/div[1]");
    }

    // Filter
    private By addEmployee() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[1]/div[2]/a/div/button");
    }

    private By inputNameCashier() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[3]/form/div[1]/div[1]/div/div/input");
    }

    private By inputPasswordCashier() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[3]/form/div[1]/div[2]/div/div/input");
    }

    private By inputConfirmPassword() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[3]/form/div[1]/div[3]/div/div/input");
    }

    private By clickRole() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[3]/form/div[1]/div[4]/select");
    }

    private By roleCashier() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[3]/form/div[1]/div[4]/select/option[2]");
    }

    private By saveBtn() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[3]/form/div[2]/div/button");
    }

    private By confirmYes() {
        return By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/button");
    }

    // ============ Functional ==================
    @Step
    public void adminClickMembershipsMenu() {
        $(CashierBtn()).click();
    }

    @Step
    public void adminClickAddEmployee() {
        $(addEmployee()).click();
    }

    @Step
    public void adminInputName(String inputName) {
        $(inputNameCashier()).type(inputName);
    }

    @Step
    public void adminInputPass(String inputPass) {
        $(inputPasswordCashier()).type(inputPass);
    }
    @Step
    public void adminInputConfirmPass(String confirmPass) {
        $(inputConfirmPassword()).type(confirmPass);
    }
    @Step
    public void adminSelectRole() {
        $(clickRole()).click();
        $(roleCashier()).click();
    }
    @Step
    public void adminClickSave() {
        $(saveBtn()).click();
    }
    @Step
    public void adminConfrimYes() {
        $(confirmYes()).click();
    }
    @Step
    public void successAdd() {$(CashierBtn()).isDisplayed(); }


}