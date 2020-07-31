package wooza.calculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarNoticias {
	@Test
	 public void open() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver navegador = new ChromeDriver();
		 
		 navegador.manage().window().maximize();
		 navegador.get("http://www.celulardireto.com.br");
		
		 //clicar na Noticia
		 navegador.findElement(By.xpath("/html/body/section[1]/div/ul/li[1]/div/a/h2")).click();
		 Thread.sleep(3000);
		 
	WebElement comparacaonoticia=
		 navegador.findElement(By.xpath("//*[@id='post-21056']/div[2]/h1"));
	  String noticia = comparacaonoticia.getText();
	  String resultadoesperado = "Comparativo: Galaxy A71 vs Mi Note10";
	  assertEquals(resultadoesperado,noticia);
	
	  
		
}}
