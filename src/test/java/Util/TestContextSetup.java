package Util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageManager;

public class TestContextSetup {
	public WebDriver driver;
	public String res;
	public TestBase testbase;
	public PageManager pm;
	public int cnt=3;
	public TestContextSetup() throws IOException {
		// TODO Auto-generated constructor stub
		testbase=new TestBase();
		pm=new PageManager(testbase.DriverManager());
	}
}
