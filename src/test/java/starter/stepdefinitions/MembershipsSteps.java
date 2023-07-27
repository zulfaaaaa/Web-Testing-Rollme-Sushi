package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.MembershipPages.*;

public class MembershipsSteps {
    @Steps
    UpdateMembershipAllDataPage updateMembershipAllDataPage;
    @Steps
    SearchByName searchPage;
    @Steps
    SearchMembershipsInvName searchMembershipsInvName;
    @Steps
    SearchMembershipsById searchMembershipsById;
    @Steps
    SearchMembershipsInvId searchMembershipsInvId;
    @Steps
    SearchMembershipsByLevel searchMembershipsByLevel;
    @Steps
    SearchMembershipsByLevelAndSearch searchMembershipsByLevelAndSearch;
    @Steps
    UpdateMembershipInvPhone updateMembershipInvPhone;
    @Steps
    UpdateMembershipInvEmail updateMembershipInvEmail;
    @Steps
    DeleteMembership deleteMembership;

    // ========================= Search Membership Valid =========================
    @And("admin click memberships menu")
    public void adminClickMembershipsMenu() {
        searchPage.adminClickMembershipsMenu();
        searchMembershipsInvName.adminClickMembershipsMenu();
    }

    @And("admin click filter icon")
    public void adminClickFilterIcon() {
        searchPage.adminClickFilterIcon();
        searchMembershipsInvName.adminClickFilterIcon();
    }

    @And("admin click search icon")
    public void adminClickSearchIcon() {
        searchPage.adminClickSearchIcon();
        searchMembershipsInvName.adminClickSearchIcon();
    }
    @Then("admin input membership name keywords listed in the search field")
    public void adminInputMembershipNameKeywordsListedInTheSearchField() {
        searchPage.adminInputMembershipNameKeywordsListedInTheSearchField();
    }
    // ========================= Search Membership Invalid Data =========================
    @And("admin input invalid membership name keywords listed in the search field")
    public void adminInputInvalidNameMembership() {
        searchMembershipsInvName.adminInputInvalidMembershipNameKeywordsListedInTheSearchField();
    }
    @Then("system displays data not found")
    public void systemDisplaysNotFound() {
        searchMembershipsInvName.systemDisplaysDataNotFound();
    }

    // ========================= Search Membership By Id =========================
    @Then("admin input membership id keywords listed in the search field")
    public void systemDisplaysData() {
        searchMembershipsById.adminInputMembershipIdKeywordsListedInTheSearchField();
    }
    // ========================= Search Membership Invalid Id =========================
    @And("admin input invalid membership id keywords listed in the search field")
    public void adminSearchInvalidId() {
        searchMembershipsInvId.adminInputInvalidMembershipIdKeywordsListedInTheSearchField();}
    // ========================= Search Membership By Level =========================
    @And("admin click dropdown level")
    public void adminSearchByLevel() {
        searchMembershipsByLevel.adminClickDropdown();}
    @And("admin select level")
    public void adminSelectLevel() {
        searchMembershipsByLevel.adminSelectLevel();}
    @Then("system displays data membership by level")
    public void systemDisplayData() {
        searchMembershipsByLevel.systemDisplayData();}

    // ========================= Search Membership By Level adn Search =========================
    @Then("admin input membership name keywords listed in the search field by level")
    public void inputNameByLevelandSearch() {
        searchMembershipsByLevelAndSearch.adminInputMembershipNameInTheSearchField();
    }



    // ========================= Update Membership =========================
    @And("admin on dashboard page for update")
    public void adminClickMemberDashboard() {
        updateMembershipAllDataPage.onDashboardForUpdate();}
    @And("admin click memberships menu for update")
    public void adminClickMemberMenu() {
        updateMembershipAllDataPage.adminClickMemberButton();}
    @And("admin select target update")
    public void adminSelectTarget() {
        updateMembershipAllDataPage.adminSelectTarget();}
    @And("admin click pen icon")
    public void adminClickPenIcon() {
        updateMembershipAllDataPage.adminClickPenIcon();}
    @And("admin on edit memberships page")
    public void adminOnEditMembershipsPage() {
        updateMembershipAllDataPage.adminOnEditMembershipsPage();}
    @And("admin edit name")
    public void adminEditName() {
        updateMembershipAllDataPage.adminEditName("Zulfasyya");}

    @And("admin edit email")
    public void adminEditEmail() {
        updateMembershipAllDataPage.adminEditEmail("zulfaaasy@gmail.com");
    }
    @And("admin edit phone number")
    public void adminEditPhoneNumber() {
        updateMembershipAllDataPage.adminEditPhoneNumber("85863083717");
    }
    @And("admin click save button")
    public void adminClickSaveButton() {
        updateMembershipAllDataPage.adminClickSaveButton();}
    @And("admin see pop up confirm")
    public void adminSeePopUpConfirm() {
        updateMembershipAllDataPage.adminSeePopUpConfirm();}
    @And("admin click yes button")
    public void adminClickYesButton() {
        updateMembershipAllDataPage.adminClickYesButton();}
    @Then("admin successfully edit data memberships")
    public void adminSuccessfullyEditDataMemberships() {
        updateMembershipAllDataPage.adminSuccessfullyEditDataMemberships();}

    // edit phone
    @And("admin edit invalid phone number")
    public void adminEditInvalidPhoneNumber() {
        updateMembershipInvPhone.adminEditPhoneNumber("13456");
    }
    // edit invalid email
    @And("admin edit invalid email")
    public void adminEditInvalidEmail() {
        updateMembershipInvEmail.adminEditEmail("zulfaaamail.com");
    }



    //delete membership
    @And("admin on dashboard page for delete")
    public void adminClickMemberDashboardDelete() {
        deleteMembership.onDashboardForUpdate();}
    @And("admin click memberships menu for delete")
    public void adminClickMemberMenuDelete() {
        deleteMembership.adminClickMemberButton();}
    @And("admin select target delete")
    public void adminSelectTargetDelete() {
       deleteMembership.adminSelectTarget();}
    @And("admin click icon delete")
    public void adminClickDeleteIcon() {
        deleteMembership.adminClickDeleteIcon();}
    @And("admin click pop up yes")
    public void adminSeePopUpConfirmDelete() {
        deleteMembership.adminClickSaveButton();}

}
