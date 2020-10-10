package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {

	WebDriver driver;

     // test nour

@Given("^Lancer Google Chrome et aller sur la page de google\\.fr$")
public void lancer_Google_Chrome_et_aller_sur_la_page_de_google_fr() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.gecko.driver","C:/Users/mahmo/eclipse-workspace/Cucumber/driver/geckodriver.exe");
	
    driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.fr/?gws_rd=ssl");
	
	//driver.get("https://www.publicisgroupe.com/fr");
		System.out.println("Ouverture du navigateur Chrome");
//    throw new PendingException();
}


@When("^Lancer une recherche du mot publicis puis cliquer sur le bouton$")
public void lancer_une_recherche_du_mot_publicis_puis_cliquer_sur_le_bouton() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Lancer la recherche publicis");
	      
	driver.findElement(By.name("q")).sendKeys("publicis");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    
    

}
// test


@Then("^Consulter la page de resultats et verifier la presence de publicis$")
public void consulter_la_page_de_resultats_et_verifier_la_presence_de_publicis() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector(".g:nth-child(1) .LC20lb > span")).click();
    //driver.findElement(By.cssSelector(".hp-link-container:nth-child(1) .hp-link-wrapper")).click();
    //driver.findElement(By.cssSelector(".cookies-banner")).click();

    //throw new PendingException();
}




}
