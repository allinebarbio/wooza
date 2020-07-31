package wooza.calculo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConsultaPlano {
 @Test
 public void open() throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 WebDriver navegador = new ChromeDriver();
	 
	 navegador.manage().window().maximize();
	 navegador.get("http://www.celulardireto.com.br");
	
	 //clicar na opção de ver plano Claro NET Virtua 120MB R$ 99,00
	 navegador.findElement(By.xpath("//*[@id='bgcolor-top-home']/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/a")).click();
	 Thread.sleep(3000);
	 
	//REALIZAR AÇÕES EM NOVA ABA
			for(String winHandle : navegador.getWindowHandles()){
				navegador.switchTo().window(winHandle);
				}
			Thread.sleep(3000);
			
	// campo CEP
	navegador.findElement(By.id("cep")).click();
	navegador.findElement(By.id("cep")).sendKeys("24120120");
	
	// campo NUMERO
	navegador.findElement(By.id("number")).click();
	navegador.findElement(By.id("number")).sendKeys("20");
	Thread.sleep(3000);
		//clicar no botao
	navegador.findElement(By.id("ver-planos-desk")).click();
	Thread.sleep(20000);
	
	//clicar no plano desejado
	navegador.findElement(By.xpath("//*[@id='cont-planos']/div/section[1]/app-destaque-combo/div[2]/ngu-carousel/div/div[1]/div/ngu-item[1]/div/div[2]/div[3]/button")).click();
	
}}
