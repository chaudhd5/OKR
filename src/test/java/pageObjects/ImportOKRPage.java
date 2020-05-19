package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import manager.DriverManager;

public class ImportOKRPage extends DriverManager {

	// WebDriver driver;
	 
	 public ImportOKRPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		

	 
	//================ Create OKR Page Web Elements ====================================================================	
	 @FindBy(xpath = "//*[@href='/import-previous-okr']") 
	  private static WebElement btn_ImportPreviousObjective;
		
	 @FindBy(xpath = "//span[text()='Add']")
	 private static WebElement btn_add;

	  @FindBy(xpath="//button[@type='submit']") 
	  private static WebElement btn_Save;
	  
	  
		//=====================================================================================	
				public void click_ImportOKRLink() {
					btn_ImportPreviousObjective.click();
					System.out.println("User is navigated to import previous OKR page");
				}
				
				public boolean verify_PreviousOKR(String Objective) {
					boolean flag = false;
						if(!driver.findElements(By.xpath("//h5[text()='"+ Objective + "']")).isEmpty()) {
							flag= true;	
							System.out.println("Previous OKRs exist for the user");
					}
						else {
							System.out.println("Expected Previous OKRs does not exist for the user");
						}
						return flag;				
				}
				
				@SuppressWarnings("deprecation")
				public void add_PreviousOKR(String Objective) throws AWTException {				
					WebElement elesrc = driver.findElement(By.xpath("//h5[text()='"+ Objective + "']//parent::div"));
					WebElement eletrget  = driver.findElement(By.xpath("//div[@class='drag-drop-col drag-drop-col4']"));		
					if (elesrc.isDisplayed() && eletrget.isDisplayed()) {
						JavascriptExecutor js = (JavascriptExecutor) driver;
			            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", elesrc, "color: yellow; border: 2px solid yellow;");
			            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", eletrget, "color: yellow; border: 2px solid yellow;");		            
						
					js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
		                    + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
		                    + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
		                    + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
		                    + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
		                    + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
		                    + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
		                    + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
		                    + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
		                    + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
		                    + "var dropEvent = createEvent('drop');\n"
		                    + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
		                    + "var dragEndEvent = createEvent('dragend');\n"
		                    + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
		                    + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
		                    + "simulateHTML5DragAndDrop(source,destination);", elesrc, eletrget);
					
			
					}			
				}
				
				public void click_addButton() throws InterruptedException {
					btn_add.click();
					Thread.sleep(2000);
				}
				
				public boolean import_previousOKR(String Objective ) throws InterruptedException {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,250)");
					btn_Save.click();
					
					Thread.sleep(20000);
					String val= Objective;				
					boolean flag = false;
					if (driver.findElement(By.xpath("//h5[@title= '" +Objective+ "']")).isDisplayed()) {
						flag = true;
						}
					return flag;
				}

}