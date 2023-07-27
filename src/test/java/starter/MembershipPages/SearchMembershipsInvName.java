package starter.MembershipPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SearchMembershipsInvName extends PageObject {
    private By membershipsBtn() {
        return By.xpath("//div[text()='Memberships']");
    }

    // Filter
    private By filterBtn() {
        return By.xpath("//button[@data-bs-toggle='collapse']");
    }

    private By inputSearch() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[1]/div[3]/div/div[1]/div/div/input");
    }
    private By notFound() {
        return By.xpath("/html/body/div/div/div/div[4]/div/div[1]/div[4]/p");
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
    public void adminClickMembershipsMenu() {
        $(membershipsBtn()).click();
    }
    @Step
    public void adminClickFilterIcon() {
        $(filterBtn()).click();
    }
    @Step
    public void adminClickSearchIcon() {
        $(inputSearch()).click();
    }
    @Step
    public void adminInputInvalidMembershipNameKeywordsListedInTheSearchField() {
        $(inputSearch()).type("sapi");
    }
    @Step
    public void systemDisplaysDataNotFound()  {
        $(notFound()).isDisplayed();
    }
}