package dataProvider;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

import cucumber.api.Scenario;


public class Utility  {

	public Utility(WebDriver driver) {
		

	}
	
	
	
	public void tearDown(Scenario scenario) {
	    if (!scenario.isFailed()) {
	      // Take a screenshot...    	
	 //   byte[] scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	   // embed it in the report.
	     // scenario.embed(scrShot, "image/png"); 
	    }
	}

	/*String fileName= reportLocation + "extentReport.html";
	
	
	 * public void ExtentReport() { //Create a Extent Report extent = new
	 * ExtentReports(); ExtentHtmlReporter htmlReporter = new
	 * ExtentHtmlReporter(fileName); htmlReporter.config().setTheme(Theme.DARK);
	 * htmlReporter.config().setDocumentTitle("Test Execution Report");
	 * htmlReporter.config().setEncoding("utf-8");
	 * htmlReporter.config().setReportName("Login Feature Report");
	 * extent.attachReporter(htmlReporter);
	 * 
	 * }
	 * 
	 * public void ExtentReportScreenshot() throws IOException { //var src =
	 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 * //Files.copy(src.toPath(), new File(reportLocation + "screenshot.png"));
	 * TakesScreenshot scrShot =((TakesScreenshot)driver); File
	 * SrcFile=scrShot.getScreenshotAs(OutputType.FILE); File DestFile=new
	 * File(reportLocation + "screenshot.png"); FileUtils.copyFile(SrcFile,
	 * DestFile); //scenarioDef.fail(); }
	 * 
	 * public void flushReport() { extent.flush();
	 * 
	 * }
	 */
	
	

}
