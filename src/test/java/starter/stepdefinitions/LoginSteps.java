package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.MembershipPages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    // ============ @TC01-PositiveLogin =============
    @Given("admin on login page")
    public void adminOnLoginPage() {
        loginPage.onLoginPage();
    }

    @When("admin input valid username")
    public void adminInputValidUsername() {
        loginPage.inputUsernameField("admin");
    }

    @And("admin input valid password")
    public void adminInputValidPassword() {
        loginPage.inputPasswordField("admin");
    }

    @And("admin click login button")
    public void adminClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("admin on dashboard page")
    public void adminOnProductsPage() {
        loginPage.userOnDashboardPage();
    }

}
