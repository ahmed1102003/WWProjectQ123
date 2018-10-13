package ww;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.TreeSet;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;

//import org.apache.commons.codec.binary.StringUtils;

//import org.apache.commons.exec.util.StringUtils;

//import org.apache.commons.exec.util.StringUtils;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.Rectangle;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JavaCode {
 
	
	private static final int waittime = 1000;
	static final int LOAD = 120;
	static WebDriver driver = null;
	private List<WebElement> findElements;
	private long avaragetime;
	private String pathfile;
	private String checkpath;
	private String textfromserach;
	private String number2;
	static final Logger log = Logger.getLogger("file3");
	static final Logger logerror = Logger.getLogger("file4");
	public void afterScenario() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Given("^User at Home page$")
	// @SuppressWarnings("deprecation")
	public void user_at_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ahmadyounis/Downloads/chromedriver 2");
		driver = new ChromeDriver();
		PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("resources/log4j.properties"));
		logerror.error("for testing the error file log ");
		log.info("for testing the info file log ");
		driver.get("https://www.weightwatchers.com/us/");
		Thread.sleep(waittime);
		Thread.sleep(waittime);
		Thread.sleep(waittime);
		Thread.sleep(waittime);
		log.info("Opened WW Home page succuffly");
	}

	@When("^Confirm the tatile is '(.*)'$")
	public void confimr_the_Title(String titile) throws InterruptedException {
		Thread.sleep(waittime);
		String webtitle = driver.getTitle();
		assertEquals(webtitle, titile);
	}	
	
	
	// This will add value to the field with ID only
	@When("^I Enter (.*) in the (.*)$")
	public void I_enter_username_in_the(String username, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.id(filed));
		findElement.clear();
		Thread.sleep(waittime);
		findElement.sendKeys(username);
		Thread.sleep(waittime);
		Thread.sleep(waittime);
	}

	@When("^I enter (.*) in the (.*) by xpath$")
	public void I_enter_username_in_by_xpath(String username, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.xpath(filed));
		findElement.clear();
		findElement.sendKeys(username);
	}

	@When("^I enter (.*) in the (.*) by name$")
	public void I_enter_username_in_by_name(String data, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.name(filed));
		findElement.clear();
		findElement.sendKeys(data);
	}

	@When("^I Click on (.*) button$")
	public void I_Click_on_ID_button(String ID) throws InterruptedException {
		Thread.sleep(waittime);
		By id = By.id(ID);
		 Thread.sleep(1000);
		driver.findElement(id).click();
	}

	@When("^I click on (.*) buttons$")
	public void I_Click_on_ID_buttons(String ID) throws InterruptedException {
		Thread.sleep(waittime);
		By id = By.id(ID);
		 Thread.sleep(1000);
		driver.findElement(id).click();
	}

	
	
	
	@When("^I Click on (.*) button by xpath$")
	public void I_click_on_xpath_button(String xpath) throws InterruptedException {
		Thread.sleep(waittime);
		By id = By.xpath(xpath);
		driver.findElement(id).click();
	}

	@When("^wait (.*) seconds$")
	public void wait_for_seconds(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}

	@When("^I click on (.*) button by name$")
	public void I_click_on_Login_button_by_name(String Name) throws InterruptedException {
		Thread.sleep(waittime);
		By id = By.name(Name);
		driver.findElement(By.name(Name)).click();
	}
	
	@When("^get the location '(.*)'$")
	public void get_the_location(String xpath) {
		By xpath2 = By.xpath(xpath);
		WebElement findElement = driver.findElement(xpath2);
		this.textfromserach = findElement.getText();
		System.out.println("the text inside the div is 1  " + textfromserach);

	}
	
	@Then("^Confrim the message will display at '(.*)'$")
	public void confirm_Messages(String xpath) throws InterruptedException {
		// Thread.sleep(1000);
		By xpath2 = By.xpath(xpath);
		// WebDriverWait wait = new WebDriverWait(driver, LOAD);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath_to_search_textbox")));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(xpath2));
		// Thread.sleep(1000);
		WebElement findElement = driver.findElement(xpath2);
		String text = findElement.getText();
		System.out.println("the text inside the div is 2  " + text);
		assertEquals(textfromserach, text);
	}
	
	
	@Then("^'(.*)' message will display at '(.*)'$")
	public void Check_Messages(String message, String xpath) throws InterruptedException {
		// Thread.sleep(1000);
		By xpath2 = By.xpath(xpath);
		// WebDriverWait wait = new WebDriverWait(driver, LOAD);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath_to_search_textbox")));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(xpath2));
		// Thread.sleep(1000);
		WebElement findElement = driver.findElement(xpath2);
		String text = findElement.getText();
		assertEquals(message, text);
	}
	
	
	@Then("^get the messages '(.*)'$")
	public void get_the_messages(String xpath) {
		// WebDriverWait wait = new WebDriverWait(driver,LOAD);
		By by = By.xpath(xpath);
		this.findElements = driver.findElements(by);
		// driver.switchTo().frame(0);
		System.out.println("Options for drop down list" + this.findElements.size());
		for (WebElement i : this.findElements) {
			String dropdownlistoption = i.getText();
			System.out.println("/" + dropdownlistoption + "|");
		}
	}
	@Then("^the following messages will be displayed$")
	public void the_following_messages_will_be_displayed(String... messages) {
		for (WebElement i : this.findElements) {
			String dropdownlistoption = i.getText();
			System.out.println("|" + dropdownlistoption + "|");
		}
		for (String i : messages) {
			System.out.println("|" + i + "|"); 
		}
		List<String> list = new ArrayList<String>(Arrays.asList(messages));
		for (WebElement webElement : this.findElements) {
			String actual = webElement.getText().trim();
			if (!StringUtils.isEmpty(actual)) {
				assertTrue(list.size() > 0);
				String excpet = list.remove(0);
				assertEquals(excpet, actual);
			}

		}
		assertEquals(0, list.size());
	}
	
	@Then("^get the messages2 '(.*)'$")
	public void get_the_messages2(String xpath) {
		// WebDriverWait wait = new WebDriverWait(driver,LOAD);
		By by = By.xpath(xpath);
		this.findElements = driver.findElements(by);
		// driver.switchTo().frame(0);
		System.out.println("the opening hours " + this.findElements.size());
		for (WebElement i : this.findElements) {
			String openhours = i.getText();
			System.out.println("/" + openhours + "|");
		}
		
		
	}
	
	@Then("^the following messages will be displayed2$")
	public void the_following_messages_will_be_displayed2(String... messages) {
		for (WebElement i : this.findElements) {
			String openhours = i.getText();
			System.out.println("|" + openhours + "|");
		}
		for (String i : messages) {
			System.out.println("|" + i + "|"); 
		}
		List<String> list = new ArrayList<String>(Arrays.asList(messages));
		for (WebElement webElement : this.findElements) {
			String actual = webElement.getText().trim();
			if (!StringUtils.isEmpty(actual)) {
				assertTrue(list.size() > 0);
				String excpet = list.remove(0);
				System.out.println("| final result is " + excpet + "| this should be Monday's Hours");
				//assertEquals(excpet, actual);
			}

		}
		assertEquals(0, list.size());
	}

	@When("^Display the opening hours$")
	public void Display_the_Opening_Hours() throws Throwable {
		get_the_messages2("//*[@id=\"content\"]/div/div/ui-view/ui-view/div[1]/div/div/div[2]/div[2]/div[1]/hours-list/ul");
		//the_following_messages_will_be_displayed2("Monday");
	}

	
	
	// Use it for debug to print all the ID to console so that we can make sure that we are in the right page to click on ID 
	@When("^Print Out all IDs$")
	public void Print_out_all_IDs() throws InterruptedException {
		List<WebElement> el = driver.findElements(By.cssSelector("*"));
		for (WebElement i : el) {
			String tagName = i.getTagName();
			String idvalue = i.getAttribute("id");
			String namevalue = i.getAttribute("name");
			if (!StringUtils.isBlank(idvalue) || !StringUtils.isBlank(namevalue)) {
				System.out.print("+++" + tagName + ": ");
				System.out.print("id=" + idvalue);
				System.out.print(" name=" + namevalue);
				System.out.println();
			}

		}
	}

	

	// Answer for Q2
	public void doesFileExist(String path) throws IOException {
		try {
			FileInputStream pathfile = new FileInputStream(path);													
			BufferedReader pass = new BufferedReader(new InputStreamReader(pathfile));
			while (true)
			{
				
			    this.checkpath = pass.readLine();
			    if (this.checkpath == null)
			    		break;
			    String[] parts = checkpath.split((","));
			    for (String i :parts) {
			    System.out.println("word1 " + i);
			    }
			}
			    pass.close();
			    pathfile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}
	
	
	
	// Answer for Q3 
	public void getthesmallestnumber() throws IOException { 
		
	int list[] = new int[]{5,4,8,9,1,5,63,0,45,23};
	int min = list[0];
	
	for(int i=1; i< list.length; i++)
	{
		if(list[i] < min)
			min = list[i];		
	}
	
	System.out.println(" the smallest number is the list is  : " + min);
	}
	     
	
}