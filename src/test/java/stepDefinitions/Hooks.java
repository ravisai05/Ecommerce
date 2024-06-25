package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Util.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup) {
		// TODO Auto-generated constructor stub
		this.testContextSetup=testContextSetup;
	}
	@After
	public void afterScenario() throws IOException {
		testContextSetup.testbase.DriverManager().quit();
	}
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException {
		WebDriver driver=testContextSetup.testbase.DriverManager();
		if(scenario.isFailed()) {
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(src);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
}
