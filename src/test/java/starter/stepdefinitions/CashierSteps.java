package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.CashierPages.AddCashier;
import starter.CashierPages.DeleteCashier;
import starter.CashierPages.SearchCashierByName;
import starter.MembershipPages.*;

public class CashierSteps {
    @Steps
    SearchCashierByName searchCashierByName;
    @Steps
    AddCashier addCashier;
    @Steps
    DeleteCashier deleteCashier;

    // ========================= Search Cashier By Name =========================
    @And("admin click cashier menu")
    public void adminClickCashierMenu() {
        searchCashierByName.adminClickMembershipsMenu();
    }

    @And("admin click filter icon on page cashier")
    public void adminClickFilterIcon() {
        searchCashierByName.adminClickFilterIcon();
    }

    @And("admin click search icon on page cashier")
    public void adminClickSearchIcon() {
        searchCashierByName.adminClickSearchIcon();
    }
    @Then("admin input cashier name keywords listed in the search field")
    public void adminInputMembershipNameKeywordsListedInTheSearchField() {
        searchCashierByName.adminInputMembershipNameKeywordsListedInTheSearchField();
    }

    // ========================= Add Cashier =========================

    @And("admin click add employee")
    public void adminClickAddEmployee() {
       addCashier.adminClickAddEmployee();
    }

    @And("admin input name cashier")
    public void adminInputName() {
        addCashier.adminInputName("Zulfa automate");
    }
    @And("admin input valid password for add cashier")
    public void adminInputPwd() {
        addCashier.adminInputPass("123qwe");
    }
    @And("admin input confirm password")
    public void adminInputConfirmPass() {
        addCashier.adminInputConfirmPass("123qwe");
    }
    @And("admin select role")
    public void adminSelectRole() {
        addCashier.adminSelectRole();
    }

    @And("admin click save for add cashier")
    public void adminClickSave() {
        addCashier.adminClickSave();
    }
    @Then("admin confirm yes")
    public void adminConfrimYes() {
        addCashier.adminConfrimYes();
    }
    @Then("system display success add new cashier")
    public void successAdd() {
       addCashier.successAdd();
    }

    //delete membership
    @And("admin select target delete cashier")
    public void adminSelectTargetDelete() {
        deleteCashier.adminSelectTarget();}
    @And("admin click icon delete cashier")
    public void adminClickDeleteIcon() {
        deleteCashier.adminClickDeleteIcon();}
    @And("admin click pop up yes delete cashier")
    public void adminSeePopUpConfirmDelete() {
        deleteCashier.adminClickSaveButton();}


}
