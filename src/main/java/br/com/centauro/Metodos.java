package br.com.centauro;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos extends DriversFactory {

	public void abrirNavegador(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void esperarClicar(By elemento, int segundos) {
		WebElement elementoFechar = driver.findElement(elemento);
		elementoFechar = new WebDriverWait(driver, Duration.ofSeconds(segundos))
				.until(ExpectedConditions.elementToBeClickable(elemento));
		if (elementoFechar.isDisplayed()) {
			elementoFechar.click();

		} else {
			System.out.println("PopUp já foram fechados.");
		}
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void fecharNavegador() {
		driver.quit();
	}

	public void validarUrl(String url) {
		String urlAtual = driver.getCurrentUrl();
		assertEquals(url, urlAtual);
	}
	
	public void validarTexto(String texto, By elemento) {
		String textoAtual = driver.findElement(elemento).getText();
		assertEquals(texto, textoAtual);
		
	}
	
	public void mouseOver(By elemento) {
		WebElement element = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void escrever(By elemento, String texto) {
	    WebElement campoTexto = driver.findElement(elemento);
	    campoTexto.clear();
	    campoTexto.sendKeys(texto);
	}

}
