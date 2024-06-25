package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	
	public WebDriver driver;
	public WebDriver DriverManager() throws IOException {

		
		if(driver==null) {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//Resources//GlobalProperties.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String browser=prop.getProperty("browser");
			String[] br=browser.split(",",5);
			for(String i: br) {
			
				if(i.equals("edge")) {
					driver=new EdgeDriver();
				}
				if(i.equals("chrome")) {
					driver=new ChromeDriver();
				}
			
				driver.get(prop.getProperty("URL"));
				driver.manage().window().maximize();
			}
			
			}
		return driver;
			
	}
}
