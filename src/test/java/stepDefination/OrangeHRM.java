package stepDefination;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ypank\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open Orange hrm home page")
    public void i_open_orange_hrm_home_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }


    @Then("I check logo presence")
    public void  iCheckLogoPresence() {
        Boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
    driver.close();
    }
}
