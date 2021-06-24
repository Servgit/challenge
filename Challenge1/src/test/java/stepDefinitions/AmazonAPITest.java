/*package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;


import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestProperties;


public class AmazonAPITest {
	
	WebDriver driver;
	
	TestProperties testProperties = new TestProperties();
	
	@Given("Launch the browser")
    public void Launch_the_browser() {
        String webDriverPath = testProperties.getWebDriver("CHROMERIVER_HOME");
        System.setProperty("webdriver.chrome.driver", webDriverPath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("**__Browser is open__**");
    }	
	

	@When("Go to Amazon main page")
	public void go_to_amazon_main_page() {
		String endpoint = testProperties.getEndpoints(System.getProperty("environment"), "AMAZON_MAINPAGE");
		driver.get(endpoint);
		WebDriverWait wait = new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-logo-sprites']")));
}

@Then("Locate upper right corner button Hello, sign in Account & lists")
public void Locate_upper_right_corner_button_hello_sign_in_account_lists() {
	driver.findElement(By.xpath("//a[@class='nav-a']\"")).click();
}

@Then("Click on “New customer? Start right here”")
public void click_on_new_customer_start_right_here() {
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

@Then("Fill Name field with the response of this API => [Options in the AC]")
public void fill_name_field_with_the_response_of_this_api_options_in_the_ac() {
	WebElement namefield = driver.findElement(By.xpath("//input[@tabindex='3']"));
    namefield.sendKeys("Firstname.Lastname@fake.com");
	
}

@Then("Fill Email field with the data from the API response Firstname.Lastname@fake.com")
public void fill_email_field_with_the_data_from_the_api_response_firstname_lastname_fake_com() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Click on Condition of Use link")
public void click_on_condition_of_use_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Locate the search bar and Search for Echo")
public void locate_the_search_bar_and_search_for_echo() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Locate “Echo support” options and click on it")
public void locate_echo_support_options_and_click_on_it() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Following elements should be displayed: Getting Started, Wi-Fi and Bluetooth, Device Software and Hardware, TroubleShooting")
public void following_elements_should_be_displayed_getting_started_wi_fi_and_bluetooth_device_software_and_hardware_trouble_shooting() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@And("Close Browser")
	public void Close_browser(){
	driver.quit();
	
}


}
*/