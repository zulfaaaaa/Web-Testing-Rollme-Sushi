package starter.MembershipPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DeleteMembership extends PageObject {
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
    private By selectTarget() {return By.xpath("/html/body/div/div/div/div[4]/div/div/div[4]/div/div[1]/div/table/tbody/tr[7]/td[1]");}
    private By deleteIcon() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[4]/div/div[1]/div/table/tbody/tr[10]/td[7]/div/div/a[2]");
    }
    private By popUp() {
        return By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/button");
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
    public void adminClickDeleteIcon() {
        $(deleteIcon()).click();
    }

    @Step
    public void adminClickSaveButton() {
        $(popUp()).click();
    }


}
