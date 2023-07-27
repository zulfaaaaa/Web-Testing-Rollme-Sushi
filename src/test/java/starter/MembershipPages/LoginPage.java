package starter.MembershipPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
public class LoginPage extends PageObject {

    // ============ @TC01-PositiveLogin =============
    private By usernameField() {
        return By.xpath("//input[@id='username']");
    }
    private By passwordField() {
        return By.xpath("//input[@id='password']");
    }
    private By loginBtn() {
        return By.xpath("//button[text()='Login']");
    }
    private By dashboardPage() {
        return By.xpath("//div[text()='Memberships']");
    }
    private By membershipsBtn() {
        return By.xpath("//a[@class='nav-link active']");
    }
    // Filter
    private By filterBtn() {
        return By.xpath("//button[@type='button']");
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

    // Edit
    private By inputIdCustomer() {
        return By.xpath("//input[@id='id']");
    }
    private By inputName() {
        return By.xpath("//input[@id='name']");
    }
    private By inputEmail() {
        return By.xpath("//input[@id='email']");
    }
    private By inputPhoneNum() {
        return By.xpath("//input[@id='phone_number']");
    }
    private By birthday() {
        return By.xpath("//input[@id='birthday']");
    }
    private By saveBtn() {
        return By.xpath("//a[text()='Silver']");
    }

    //======================== Functional ==================
    // ============ @TC01-PositiveLogin =============
    @Step
    public void onLoginPage() {
        open();
        $(loginBtn()).shouldBeVisible();
    }
    @Step
    public void inputUsernameField(String username) {
        $(usernameField()).type(username);
    }
    @Step
    public void inputPasswordField(String password) {
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginBtn() {
        $(loginBtn()).click();
    }
    @Step
    public boolean userOnDashboardPage() {
        return $(dashboardPage()).isDisplayed();
    }

}
