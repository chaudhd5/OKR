package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import manager.DriverManager;

public class CreateOKRPage extends DriverManager {

	// WebDriver driver;

	public CreateOKRPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//================ Create OKR Page Web Elements ====================================================================	
	@FindBy(xpath = "//a[@href='/new-okr']")
	private WebElement btn_newOKR;

	@FindBy(xpath = "//a[@href='/unlock-me']//parent::li")
	private WebElement btn_unlockMe;

	@FindBy(xpath = "//a[@href='/faqs']")
	private WebElement btn_faqs;

	@FindBy(xpath = "//a[@href='/team-management']")
	private WebElement btn_TeamManagment;

	@FindBy(xpath = "//div[@class='outer-wrapper']")
	private static WebElement link_Page;

	@FindBy(xpath = "//*[@href='/create-new-objective']")
	private static WebElement btn_CreateNewObjective;

	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement link_SignUp1;

	@FindBy(id = "add-objective")
	private static WebElement edt_AddAnObjective;

	@FindBy(xpath = "//input[@id='add-objective']//following::input[@id='add-objective']")
	private static WebElement edt_AddAnObjective2;

	@FindBy(xpath = "//input[@id='short-desc']//following::input[@id='short-desc']")
	private static WebElement edt_Shortdescription2;

	@FindBy(id = "short-desc")
	private static WebElement edt_Shortdescription;

	@FindBy(id = "aspirational-btn")
	private static WebElement btn_TypeOfObjectives_Aspirational;

	@FindBy(id = "operational-btn")
	private static WebElement btn_TypeOfObjectives_Operational;

	@FindBy(id = "align-dropdown")
	private static WebElement btn_selectFromList;

	@FindBy(id = "align-owner")
	private static WebElement btn_assignToMe;

	@FindBy(xpath = "//button[@id='align-owner']//following::button[@id='align-owner']")
	private static WebElement btn_assignToMe2;

	@FindBy(xpath = "//div[@class='MuiAutocomplete-endAdornment']")
	private WebElement drop_downSelect;

	@FindBy(xpath = "//div[@class='align-emp-list']")
	private static WebElement sel_AlignTo;

	@FindBy(xpath = "//div[@class='align-to-field']//child::div[1]//div[1]//input")
	private static WebElement edt_AlignTo;

	@FindBy(xpath = "//h3[contains(text(),'Create/Edit Objective')]")
	private static WebElement headerOKR;

	@FindBy(xpath = "//div[@class='key-add-action']//button[1]")
	private static WebElement btn_AddKeyResults;

	@FindBy(xpath = "//div[@class='key-add-action']/following::input[1]")
	private static WebElement edt_keyResults;

	@FindBy(xpath = "//div[@class='key-add-action']/following::input[1]//following::div[@class='key-add-action']/following::input[1]")
	private static WebElement edt_keyResults2;

	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement btn_Save;

	@FindBy(xpath = "//span[text()='Save & Add New']")
	private static WebElement btn_SaveAddNew;

	@FindBy(xpath = "//div[@class='write-objective-field']//child::button")
	private WebElement btn_deleteObjective;

	@FindBy(xpath = "//h2[contains(text(),'View')]//following::span[text()='Go Ahead']")
	private WebElement btn_RedirectGoAhead;

	@FindBy(xpath = "//h2[contains(text(),'Delete')]//following::span[text()='Go Ahead']")
	private WebElement btn_deleteGoAhead;

	@FindBy(xpath = "//input[@placeholder='Search by Name/Employee id..']")
	private WebElement edt_TeamOKR_Search;

	@FindBy(xpath = "//*[text()='Go Back to Your Account']//following::a[@href='/']")
	private WebElement lbl_Viewing;

	@FindBy(xpath = "//div[@class='lists-content']//ul//li[1]")
	private List<WebElement> search_list;

	@FindBy(id = "jira-feedback-button")
	private WebElement lnk_JiraFeedback;

	@FindBy(xpath = "//div[@class='help-menu']")
	private WebElement lnk_HelpMenu;

	@FindBy(xpath = "//*[@class='user-tab']//child::button")
	private WebElement btn_profileDropDown;

	@FindBy(xpath = "//ul[@id='menu-list-grow']//child::li[1]")
	private WebElement btn_profile;

	@FindBy(xpath = "//ul[@id='menu-list-grow']//child::li[2]")
	private WebElement btn_logout;

	@FindBy(xpath = "//span[text()='Upload Photo']")
	private WebElement btn_uploadPhoto;

	@FindBy(xpath = "//label[text()='Choose a file']")
	private WebElement btn_ChooseAFile;

	@FindBy(xpath = "//span[text()='Upload']")
	private WebElement btn_upload;

	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement btn_Cancel;

	@FindBy(xpath = "//div[@class='profile-form-top']//img[@class='MuiAvatar-img']")
	private WebElement img_Verify;

	@FindBy(xpath = "//div[@role='group']//span[text()='Aspirational OKR']")
	private WebElement tb_AspirationalOKR;

	@FindBy(xpath = "//div[@role='group']//span[text()='Operational OKR']")
	private WebElement tb_operationalOKR;

	@FindBy(xpath = "//div[@class='MuiCardContent-root']")
	private WebElement box_cart;

	@FindBy(xpath = "//div[@class='MuiCardContent-root']//child::button[2]")
	private WebElement btn_edit;

	@FindBy(xpath = "//span[text()='OKRs Attained']")
	private WebElement lbl_OKRAttained; // verify home page

	@FindBy(xpath = "//div[@class='objective-percentage']//h3") // get All percentage getText()
	private WebElement val_objPercentage;

	@FindBy(xpath = "//span[text()='OKRs Attained']//parent::h3") // get All percentage getText()
	private WebElement val_avgPercentage;
	
	
	@FindBy(xpath = "//*[text()='Key Result 1']//ancestor::div[@class='obj-keys-card']//child::*[text()='Comments']")
	private WebElement view_CommentsBtn;
	
	@FindBy(xpath = "//*[text()='Key Result 1']//ancestor::div[@class='obj-keys-card']//child::input[@placeholder='Type your reply here']")
	private WebElement view_CommentBox;
	
	@FindBy(xpath = "//*[text()='Key Result 1']//ancestor::div[@class='obj-keys-card']//child::span[text()='Send']")
	private WebElement view_CommentSend;
	
	@FindBy(xpath = "//div[@class='comment-text']//span[text()='Just now']")
	private List<WebElement> view_CommentVerify;
//=====================================================================================	
	public void click_NewOKRTab() {
		btn_newOKR.click();
		System.out.println("");
	}

	public boolean click_CreateNewObjective() {
		boolean flag = false;
		try {
			// link_Page.clear();

			// JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("document.getElementByxpath('//div[@class='outer-wrapper']').focus();");
			Thread.sleep(2000);
			Actions acn = new Actions(driver);
			acn.moveToElement(btn_CreateNewObjective).build().perform();

			if (btn_CreateNewObjective.isEnabled()) {
				btn_CreateNewObjective.click();
				Thread.sleep(200);
				if (headerOKR.isDisplayed()) {
					flag = true;
				}
			}
			/*
			 * Actions acn = new Actions(driver); acn.moveToElement(btn_CreateNewObjective);
			 * btn_CreateNewObjective.click();
			 */
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public void set_Objective(String Objective) {
		edt_AddAnObjective.sendKeys(Objective);
	}

	public void set_ShortDescrption(String Descrption) {
		edt_Shortdescription.sendKeys(Descrption);
	}

	public void set_ObjectiveType(String ObjectiveType) {
		if (ObjectiveType.equalsIgnoreCase("Aspirational OKR")) {
			btn_TypeOfObjectives_Aspirational.click();
		} else if (ObjectiveType.equalsIgnoreCase("Operational OKR")) {
			btn_TypeOfObjectives_Operational.click();
		} else {
			System.out.println("Provided objective type is wrong");
		}
	}

	public void select_AlignManager(String AlignManager) throws InterruptedException {
		btn_selectFromList.click();
		// btn_assignToMe.click();
		Thread.sleep(2000);
		drop_downSelect.click();
		Thread.sleep(2000);
		edt_AlignTo.sendKeys(AlignManager);

		sel_AlignTo.click();

	}

	public void click_addKeys() throws InterruptedException {
		btn_AddKeyResults.click();
		Thread.sleep(2000);
	}

	public void set_Keys(String KeyValue) throws InterruptedException {
		// btn_AddKeyResults.click();
		if (KeyValue.contains(",")) {
			String[] words = KeyValue.split(",");
			driver.findElement(By.xpath("//div[@class='key-add-action']/following::input[1]")).sendKeys(words[0]);
			click_addKeys();
			driver.findElement(By.xpath("//div[@class='key-add-action']/following::input[3]")).sendKeys(words[1]);
			click_addKeys();
			driver.findElement(By.xpath("//div[@class='key-add-action']/following::input[5]")).sendKeys(words[2]);
		} else {
			edt_keyResults.sendKeys(KeyValue);
		}
	}

	public void Click_SaveButton() {
		btn_Save.click();
	}

	public void Click_SaveAndAddNewButton() {
		btn_SaveAddNew.click();
	}

	public boolean verify_OKRCreation(String Objective) throws InterruptedException {
		Thread.sleep(20000);
		String val = Objective;

		boolean flag = false;
		if (driver.findElement(By.xpath("//h5[@title= '" + Objective + "']")).isDisplayed()) {
			flag = true;
		}
		return flag;
	}

	public boolean verify_OKRCreation_MultipleKeys(String Objective) throws InterruptedException {
		Thread.sleep(20000);

		boolean flag = false;
		if (driver
				.findElement(By.xpath("//h5[@title= '" + Objective
						+ "']//following::div[@class='objective-summary']//child::p[2][text()='3 Key Results']"))
				.isDisplayed()) {
			flag = true;
		}
		return flag;
	}

	public void click_editObjective(String Objective) throws InterruptedException {
		if (driver.findElement(By.xpath("//h5[@title= '" + Objective + "']")).isDisplayed()) {
			driver.findElement(By.xpath("//h5[@title= '" + Objective
					+ "']/../preceding-sibling::div[@class='okr-card-top']//child::span[@class='MuiTouchRipple-root']//parent::button"))
					.click();
			Thread.sleep(20000);

		}
	}

	public void click_deleteObjective() throws InterruptedException {
		btn_deleteObjective.click();
		Thread.sleep(2000);
		btn_deleteGoAhead.click();
		Thread.sleep(20000);
	}

	public void set_Objective2() {
		edt_AddAnObjective2.sendKeys("Automation POC");
	}

	public void set_ShortDescrption2() {
		edt_Shortdescription2.sendKeys("For Testing");
	}

	public void select_AlignManagerToMe() throws InterruptedException {
		btn_assignToMe2.click();
	}

	public void set_addKeys2() throws InterruptedException {
		edt_keyResults2.sendKeys("POC Complete");
		Thread.sleep(2000);
	}

	public void click_TeamManagmentTab() throws InterruptedException {
		btn_TeamManagment.click();
		Thread.sleep(2000);

	}

	public void select_Employee(String EmployeeName) throws InterruptedException {
		edt_TeamOKR_Search.sendKeys(EmployeeName);
		Thread.sleep(5000);
		int count = 0;
		for (WebElement ele : search_list) {
			String str = EmployeeName;
			if (str.contains(ele.getText())) {
				// ele.click();
				count = count + 1;
				break;
			}
		}
		driver.findElement(By.xpath("//div[@class='lists-content']//ul[" + count + "]//li[5]//child::button")).click();
		Thread.sleep(1000);
	}

	public void click_GoAhead() throws InterruptedException {
		btn_RedirectGoAhead.click();
		Thread.sleep(5000);
		// Viewing Anurag's OKR
	}

	public boolean verifyTeamObjectiveView(String EmployeeName) {
		boolean flag = false;
		String lable = lbl_Viewing.getText();
		if (lable.contains("Viewing " + EmployeeName + " OKR")) {
			flag = true;
			System.out.println("Viewing" + EmployeeName + "OKRs");
		}
		return flag;
	}

	public void click_OnComment(String Objective) throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='" + Objective
				+ "']//ancestor::div[@class='MuiCardContent-root']//child::*[text()='Comments']")).click();
		Thread.sleep(5000);

	}
	
	public boolean enter_Comment() throws InterruptedException {
		boolean flag = false;
		view_CommentsBtn.click();
		Thread.sleep(5000);
		 view_CommentBox.sendKeys("Tested Comment Sucessfully");
		 view_CommentSend.click();
		 Thread.sleep(5000);
		int justNowCount= view_CommentVerify.size();
			if (justNowCount>0) {
				flag = true;
			}
			
			else {
				flag = false;
			}
			return flag;
		
	}
}
