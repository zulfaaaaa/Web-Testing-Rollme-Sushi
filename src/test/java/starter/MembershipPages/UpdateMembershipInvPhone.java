package starter.MembershipPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class UpdateMembershipInvPhone extends PageObject {
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

    // Edit
    private By membershipsBtn() {
        return By.xpath("//div[text()='Memberships']");
    }
    private By selectTarget() {return By.xpath("/html/body/div/div/div/div[4]/div/div/div[4]/div/div[1]/div/table/tbody/tr[1]/td[2]");}
    private By penIcon() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[4]/div/div[1]/div/table/tbody/tr[1]/td[7]/div/div/a[1]");
    }
    private By membershipPage() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[1]/div/h1");
    }
    private By hapusName() { return By.xpath("/html/body/div/div/div/div[4]/div/div/div[2]/form/div[1]/div[1]/div/div/button");}
    private By inputName() {
        return By.xpath("//input[@id='name']");
    }
    private By hapusEmail() { return By.xpath("/html/body/div/div/div/div[4]/div/div/div[2]/form/div[1]/div[3]/div/div/button");}
    private By inputEmail() {
        return By.xpath("//input[@id='email']");
    }
    private By hapusPhone() { return By.xpath("/html/body/div/div/div/div[4]/div/div/div[2]/form/div[1]/div[4]/div/div/button");}
    private By inputPhoneNum() {
        return By.xpath("//input[@id='phone_number']");
    }
    private By birthday() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[2]/form/div[1]/div[5]/div/div/input");
    }
    private By saveBtn() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[2]/form/div[2]/div/button");
    }
    private By popUp() {
        return By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/button");
    }
    private By submitYes() {
        return By.xpath("//button[text()='Yes']");
    }


    // ===================== edit =======================
    @Step
    public void onDashboardForUpdate() {
        $(membershipsBtn()).isDisplayed();
    }
    @Step
    public void adminClickMemberButton()  {
        $(membershipsBtn()).click();
    }
    @Step
    public void adminSelectTarget()  {
        $(selectTarget()).click();
    }
    @Step
    public void adminClickPenIcon() {
        $(penIcon()).click();
    }

    @Step
    public void adminOnEditMembershipsPage() {
        $(membershipPage()).isDisplayed();
    }

    @Step
    public void adminEditPhoneNumber(String editPhone) {
        $(hapusPhone()).click();
        $(inputPhoneNum()).type(editPhone);
    }


    @Step
    public void adminClickSaveButton() {
        $(saveBtn()).click();
    }

    @Step
    public void adminSeePopUpConfirm() {
        $(popUp()).isDisplayed();
    }

    @Step
    public void adminClickYesButton() {
        $(submitYes()).click();
    }

    @Step
    public void adminSuccessfullyEditDataMemberships() {
        $(membershipPage()).isDisplayed();
    }
}
