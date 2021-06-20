package com.Test.Arunkumar.StepDefinitions;

import com.Test.Arunkumar.PageActions.MyAccountActions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountStepDef extends MyAccountActions {

	@When("I navigate to personal information page")
	public void navigate_to_personal_information_page()
	{
		clickMyAccount();
		clickPersonalInformation();
	}
	
	@When("^I update FirstName (.+) in personal information page using password (.+) and submit$")
	public void update_firstName(String updatedName , String password){
		updateFirstName(updatedName,password);
		savePersonalInformationChanges();
		validateSuccessMessage();
	}
	
	@Then("^I validate the updated first name$")
	public void validate_the_updated_first_name(){
		validateUpdatedFirstName();
	}
}
