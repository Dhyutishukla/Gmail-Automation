package stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtil;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ComposeEmail {
	WebDriver driver = DriverUtil.setupChromeDriver();

	@Given("^there is a user who visits the login page$")
	public void thereIsAUserWhoVisitsTheLoginPage() {
		System.out.println("Inside step-user is on login page");
		driver.get("https://www.google.com/");
		WebElement loginButton = driver.findElement(By.linkText("Sign in"));
		loginButton.click();
	}

	@And("^user login with username \"([^\"]*)\" with password \"([^\"]*)\"$")
	public void userLoginWithUsernameWithPassword(String arg0, String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement emailTextBox = driver.findElement(By.cssSelector("input[type='email']"));
		emailTextBox.sendKeys(arg0);
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		nextButton.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))
		);
		WebElement passwordTextBox = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		passwordTextBox.sendKeys(arg1);

	}

	@And("^user enter on clicks button$")
	public void userEnterOnClicksButton() {
		WebElement nextButtonOnPasswordPage = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		nextButtonOnPasswordPage.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.urlToBe("https://www.google.com/"));
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		gmailLink.click();
	}

	@When("^user sends an email to \"([^\"]*)\" with subject \"([^\"]*)\" with body\"([^\"]*)\"$")
	public void userSendsAnEmailToWithSubjectWithBody(String arg0, String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Compose')]")));
		WebElement composeButton = driver.findElement(By.xpath("//div[contains(text(), 'Compose')]"));
		composeButton.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='to']")));
		WebElement toEmailTextArea = driver.findElement(By.xpath("//textarea[@name='to']"));
		WebElement subjectTextBox = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		WebElement bodyTextArea = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));


		toEmailTextArea.sendKeys(arg0);
		subjectTextBox.sendKeys(arg1);
		bodyTextArea.sendKeys(arg2);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Send')]")));
		WebElement sendButton = driver.findElement(By.xpath("//div[contains(text(), 'Send')]"));
		sendButton.click();

	}

	@Then("^the email appears in sent folder of gmail with subject \"([^\"]*)\" with body \"([^\"]*)\"$")
	public void theEmailAppearsInSentFolderOfGmailWithSubjectWithBody(String arg0, String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement sentLink = driver.findElement(By.linkText("Sent"));
		sentLink.click();
	}

	}
