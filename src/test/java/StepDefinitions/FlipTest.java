package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class FlipTest {

	WebDriver driver = null;
	
	@Given("User is on flip homepage")
	public void flip_homepage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flip.id/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.or(
	        ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Pakai Flip!')]"))
	    ));
	}
	
	@When("User verify bantuan button")
	public void verify_bantuan_button() {
		assertEquals(true, driver.findElement(By.xpath("//a[contains(text(),'Bantuan')]")).isDisplayed());
		System.out.println("Bantuan Button is displayed – Assert passed");
	}
	
	@And("User click bantuan button")
	public void click_bantuan_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Bantuan')]")).click();
	}
	
	@Then("User is on bantuan page")
	public void bantuan_page() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Beranda']/img[contains(@alt,'Bantuan')]"))
        ));
	    driver.close();
	}
	
	@When("User verify karir button")
	public void verify_karir_button() {
		assertEquals(true, driver.findElement(By.xpath("//button[contains(text(),'Karir')]")).isDisplayed());
		System.out.println("Karir Button is displayed – Assert passed");
	}
	
	@And("User click karir button")
	public void click_karir_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Karir')]")).click();
	}
	
	@Then("User is on karir page")
	public void karir_page() {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("job-title-search"))
        ));
	    driver.close();
	}
	
	@When("User verify biaya button")
	public void verify_biaya_button() {
		assertEquals(true, driver.findElement(By.linkText("Biaya")).isDisplayed());
		System.out.println("Biaya Button is displayed – Assert passed");
	}
	
	@And("User click biaya button")
	public void click_biaya_button() {
		driver.findElement(By.linkText("Biaya")).click();
	}
	
	@Then("User is on biaya page")
	public void biaya_page() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.className("biaya-title"))
        ));
	    driver.close();
	}
	
	@When("User verify masuk button")
	public void verify_masuk_button() {
		assertEquals(true, driver.findElement(By.xpath("//button[contains(text(),'Masuk')]")).isDisplayed());
		System.out.println("masuk Button is displayed – Assert passed");
	}
	
	@And("User click masuk button")
	public void click_masuk_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Masuk')]")).click();
	}
	
	@Then("User is on masuk page")
	public void masuk_page() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'MASUK')]"))
        ));
	    driver.close();
	}
	
}