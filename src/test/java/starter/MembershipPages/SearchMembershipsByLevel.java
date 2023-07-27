package starter.MembershipPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SearchMembershipsByLevel extends PageObject {
    private By membershipsBtn() {
        return By.xpath("//div[text()='Memberships']");
    }

    // Filter
    private By filterBtn() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[2]/div/button");
    }

    private By dropdown() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[3]/div/div[2]/div/a");
    }

    private By levelGold() {
        return By.xpath("//a[text()='Gold']");
    }

    private By levelSilver() {
        return By.xpath("//a[text()='Silver']");
    }

    private By levelBronze() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div/div[3]/div/div[2]/div/ul/li[3]/button");
    }
    private By systemDisplayBronze() { return By.xpath("/html/body/div/div/div/div[4]/div/div/div[4]/div/div[1]/div/table/tbody/tr[1]/td[4]");}


    // ============ Functional ==================
    @Step
    public void adminClickMembershipsMenu() {
        $(membershipsBtn()).click();
    }
    @Step
    public void adminClickFilterIcon() {
        $(filterBtn()).click();
    }
    @Step
    public void adminClickDropdown() {
        $(dropdown()).click();
    }
    @Step
    public void adminSelectLevel() {
        $(levelBronze()).click();
    }
    @Step
    public boolean systemDisplayData() {
        return $(systemDisplayBronze()).isDisplayed();
    }
}