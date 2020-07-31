	package wooza.calculo;

	import static org.junit.Assert.assertEquals;

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ValidarNoticiaTituloEleitor {
		@Test
		 public void open() throws InterruptedException{
			 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 WebDriver navegador = new ChromeDriver();
			 
			 navegador.manage().window().maximize();
			 navegador.get("http://www.celulardireto.com.br");
			
			 //clicar na Noticia
navegador.findElement(By.xpath("/html/body/section[1]/div/ul/li[3]/div/a/h2")).click();
			 Thread.sleep(3000);
			 
		WebElement comparacaonoticia=
			 navegador.findElement(By.xpath("/html/body/section[1]/div/ul/li[3]/div/a/p"));
		  String noticia = comparacaonoticia.getText();
		  String resultadoesperado = "Título de eleitor: como consultar e descobrir o número pela internet";
		  assertEquals(resultadoesperado,noticia);
}}