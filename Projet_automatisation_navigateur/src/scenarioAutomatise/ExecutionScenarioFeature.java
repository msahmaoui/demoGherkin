package scenarioAutomatise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ExecutionScenarioFeature {

WebDriver driver;

//Ceci est la demo du 16/10/2020

@Given("^Lancer Google Chrome et aller sur la page de google\\.fr$")
public void lancer_Google_Chrome_et_aller_sur_la_page_de_google_fr() throws Throwable {

	System.setProperty("webdriver.gecko.driver","C:/Users/mahmo/eclipse-workspace/Cucumber/driver/geckodriver.exe");
	
    driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.fr/?gws_rd=ssl");
	driver.manage().window().maximize();
	System.out.println("==> Ouverture du navigateur Chrome");
}


@When("^Faire une recherche du mot publicis puis cliquer sur le bouton rechercher$")
public void faire_une_recherche_du_mot_publicis_puis_cliquer_sur_le_bouton_rechercher() throws Throwable {
	System.out.println("==> Lancer la recherche publicis");
	driver.findElement(By.name("q")).sendKeys("publicis");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    
  //  throw new PendingException();
}

@Then("^Consulter la page de resultats et aller sur le site de Publicis$")
public void consulter_la_page_de_resultats_et_aller_sur_le_site_de_Publicis() throws Throwable {
	driver.findElement(By.cssSelector(".g:nth-child(1) .LC20lb > span")).click();
	//driver.close();
	System.out.println("==> Fin du scénarion. Fermeture du navigateur");
}



}
