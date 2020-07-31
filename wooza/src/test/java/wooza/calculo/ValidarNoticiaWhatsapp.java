	package wooza.calculo;

	import static org.junit.Assert.assertEquals;

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ValidarNoticiaWhatsapp {
		@Test
		 public void open() throws InterruptedException{
			 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 WebDriver navegador = new ChromeDriver();
			 
			 navegador.manage().window().maximize();
			 navegador.get("http://www.celulardireto.com.br");
			
			 //clicar na Noticia
navegador.findElement(By.xpath("/html/body/section[1]/div/ul/li[5]/div/a/p")).click();
			 Thread.sleep(3000);
			 
		WebElement comparacaonoticia=
			 navegador.findElement(By.xpath("/html/body/section[1]/div/ul/li[5]/a/img"));
		  String noticia = comparacaonoticia.getText();
		  String resultadoesperado = "whatsapp: como desativar sua conta temporariamente";
		  assertEquals(resultadoesperado,noticia);
}}
