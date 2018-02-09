package Inicio;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;
import junit.framework.Assert;

public class propriedadesaplicacao {

	@Test
	public void cenario01() throws MalformedURLException, InterruptedException {
		
		/*Inicio da Instancia para declarar as variaveis do sistema e aplicativo para testes*/
		DesiredCapabilities capacidade = new DesiredCapabilities();
		
		/*Declara a variavel do nome do seu telefone*/
		capacidade.setCapability("deviceName", "4200e2d50012a47d");
		
		/*Declara a variavel do seu sistema Operacional*/
		capacidade.setCapability("platformName", "Android");
		
		/*Declara a variavel da versão do seu Android*/
		capacidade.setCapability("platformVersion", "6.0.1");
		
		/*Declara a variavel da package do aplicativo que voce vai automatizar*/
		capacidade.setCapability("appPackage", "solutions.infinitus.ViaSulPMAAPP");
		
		/*Declara a variavel da ação que vai iniciar o aplicativo*/
		capacidade.setCapability("appActivity", "md5e24981cfc49ae55d7d1ff5c31d1b1c61.MainActivity");
		
		/*Instacia o driver de conexão e inicio do aplicativo*/
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
				/*Teste abrindo o Whatsapp*/
				/*capacidade.setCapability("appPackage", "com.whatsapp");
				capacidade.setCapability("appActivity", "com.whatsapp.Main");*/
				
		/*Aguardar a tela carregar para clicar*/
		Thread.sleep(20000);
				
		/*Clicar no botão iniciar do IPMAgro*/
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds = '[213,858][327,960]']")).click();
		Thread.sleep(5000);
		
		/*Preencher o campo de Categoria*/
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,169][516,237]']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'TRATOR']")).click();
		Thread.sleep(5000);
		
		/*Preencher o campo de Marca*/
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,277][516,345]']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'AGRALE']")).click();
		Thread.sleep(5000);
		
		/*Preencher o campo de Modelo*/
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,385][516,453]']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = '4100 4X2']")).click();
		Thread.sleep(5000);
		
		/*Preencher o campo de Ano*/
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,493][516,561]']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = '2016']")).click();
		Thread.sleep(5000);
		
		/*Preencher o campo de UF*/
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,601][516,669]']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'ACRE']")).click();
		Thread.sleep(5000);
		
		
		/*Clicar no botão iniciar de buscar*/
		driver.findElement(By.xpath("//android.widget.Button[@bounds = '[24,684][516,756]']")).click();
		Thread.sleep(10000);
		
		String ValorEquipamento = driver.findElement(By.xpath("//android.widget.TextView[@bounds = '[18,677][266,721]']")).getText();
		
		System.out.println(ValorEquipamento);
		
		/*-driver.findElement(By.id("")).sendKeys("3");
		driver.findElement(By.id("br.com.libertyseguros.mobile.corretor:id/btnLogin")).click();
		driver.findElement(By.id("br.com.libertyseguros.mobile.corretor:id/editUsuarioLogin")).sendKeys("renevj");
		driver.findElement(By.id("br.com.libertyseguros.mobile.corretor:id/editSenhaLogin")).sendKeys("Li1234!@");
		driver.findElement(By.id("br.com.libertyseguros.mobile.corretor:id/btnLogin")).click();
		Assert.assertEquals("O triângulo é Equilátero", driver.findElement(By.id("com.eliasnogueira.trianguloapp:id/txtResultado")).getText());*/
		
	}
	
	
	
}
