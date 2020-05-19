package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import manager.DriverManager;
import manager.PageObjectManager;
import pageObjects.CreateOKRPage;
import pageObjects.HomePage;

public class CreateOKRDefinition extends DriverManager {
	private static final String String = null;
	// ====== Class Variables ============================
	// WebDriver driver;
	HomePage homePage;
	ConfigFileReader configsFileReader;
	PageObjectManager pageObjectManager;
	CreateOKRPage createOKRpage;

	@Given("^User is at OKR Home page$")
	public void user_is_at_OKR_Home_page() {
		// Write code here that turns the phrase above into concrete actions
		// driver = new ChromeDriver();
		pageObjectManager = new PageObjectManager(driver);
		createOKRpage = pageObjectManager.getCreateOKRPage();
		System.out.println("User is navigated to Home Page sucessfully.");

	}

	@When("^User click on New OKR tab$")
	public void user_click_on_New_OKR_tab() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		createOKRpage.click_NewOKRTab();
	}

	@Then("^User should be at create new okr page$")
	public void user_should_be_at_create_new_okr_page() {
		// Write code here that turns thephrase above into concrete actions
		String rTitle = driver.getCurrentUrl();
		Assert.assertTrue(rTitle.contains("/new-okr"));
		System.out.println("User is navigated to Create OKR Page sucessfully.");
	}

	@Then("^User clicks on Create New Objective$")
	public void user_clicks_on_Create_New_Objective() {
		// Write code here that turns th phrase above into concrete actions
		boolean flagTest = false;
		flagTest = createOKRpage.click_CreateNewObjective();
		assertTrue(flagTest);
	}

	@Then("^User enter \"([^\"]*)\" in Objective field$")
	public void user_enter_in_Objective_field(String Objective) {
		// Write code here thaturns the phrase above into concrete actions
		createOKRpage.set_Objective(Objective);
	}

	@Then("^User enter \"([^\"]*)\" in type of short description for objective field$")
	public void user_enter_in_type_of_short_description_for_objective_field(String Descrption) {
		// Write code here that turns the phrase above into concrete

		createOKRpage.set_ShortDescrption(Descrption);
	}

	@Then("^User select \"([^\"]*)\" in type of objective field$")
	public void user_select_in_type_of_objective_field(String ObjectiveType) {
		// Write codehere that turns the phrase above into concrete actions
		createOKRpage.set_ObjectiveType(ObjectiveType);
	}

	@Then("^user select \"([^\"]*)\" in align manager field$")
	public void user_select_in_align_manager_field(String AlignManager) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		createOKRpage.select_AlignManager(AlignManager);
	}

	@Then("^user add \"([^\"]*)\" in key field$")
	public void user_add_in_key_field(String keyValue) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		createOKRpage.set_Keys(keyValue);
	}
	
	@Then("^user add following in key field$")
	public void user_add_following_in_key_field(DataTable keys) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    List<Map<String, String>> data = keys.asMaps(String.class, String.class);
	
	    
	    String keyval1 = data.get(0).get("keys");
	    String keyval2 = data.get(1).get("keys");
	    String keyval3 = data.get(2).get("keys");
	    String keyval = keyval1 + "," + keyval2 + "," + keyval3 ;
	    createOKRpage.set_Keys(keyval);
			
	}

	@Then("^Click on Save button$")
	public void click_on_Save_button() { // Write code here that turns the phrase above into concrete actions
		createOKRpage.Click_SaveButton();
	}
	
	@And("^Click on Save And Add New button$")
	public void click_on_Save_And_Add_button() { // Write code here that turns the phrase above into concrete actions
		createOKRpage.Click_SaveAndAddNewButton();		
	}

	@Then("^User should be navigated to home page and \"([^\"]*)\" should have been created$")
	public void user_should_be_navigated_to_home_page_and_objective_should_have_been_created(String Objective) throws InterruptedException {	
		boolean flagTest = false;
		flagTest = createOKRpage.verify_OKRCreation(Objective);
		assertTrue(flagTest);
	}
	

	@Then("^User should be navigated to home page and \"([^\"]*)\" with multiple keys should have been created$")
	public void user_should_be_navigated_to_home_page_and_objective_with_multiple_keys_should_have_been_created(String Objective) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean flagTest = false;
		flagTest = createOKRpage.verify_OKRCreation_MultipleKeys(Objective);
		assertTrue(flagTest);
	}
	
	@When("^user click on \"([^\"]*)\" edit button$")
	public void user_click_on_edit_button(String Objective) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		createOKRpage.click_editObjective(Objective);
	}

	@Then("^User should be able to navigate to edit OKR page$")
	public void user_should_be_able_to_navigate_to_edit_OKR_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		String rTitle = driver.getCurrentUrl();
		Assert.assertTrue(rTitle.contains("edit-okr?"));
	}

	@Then("^user delete objective$")
	public void user_delete() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		createOKRpage.click_deleteObjective();
	}

	@Then("^\"([^\"]*)\" should not be visible at home page$")
	public void objective_should_not_be_visible_at_home_page(String Objective) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean flagTest = false;
		flagTest = createOKRpage.verify_OKRCreation(Objective);
		assertFalse(flagTest);
	}
	
	@Then("^User should be able to add another Objective$")
	public void user_should_be_able_to_add_another_Objective() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		createOKRpage.set_Objective2();
		createOKRpage.set_ShortDescrption2();
		createOKRpage.select_AlignManagerToMe();
		createOKRpage.set_addKeys2();
		createOKRpage.Click_SaveButton();
	}

	@Then("^User should be navigated to home page and objective should have been created$")
	public void user_should_be_navigated_to_home_page_and_objective_should_have_been_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(20000);
		boolean flagTest = false;
		flagTest = createOKRpage.verify_OKRCreation("Automation POC");
		assertTrue(flagTest);
	}


}
