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
				
		/*WebDriverWait wait = new WebDriverWait(AppiumController.instance.driver,timeout);*/
		Thread.sleep(20000);
				
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds = '[213,858][327,960]']")).click();
		
				
		/*driver.findElement(By.className("android.view.ViewGroup")).click();*/ 
		
		
		/*driver.findElement(By.id("")).sendKeys("3");
		driver.findElement(By.id("br.com.libertyseguros.mobile.corretor:id/btnLogin")).click();
		driver.findElement(By.id("br.com.libertyseguros.mobile.corretor:id/editUsuarioLogin")).sendKeys("renevj");
		driver.findElement(By.id("br.com.libertyseguros.mobile.corretor:id/editSenhaLogin")).sendKeys("Li1234!@");
		driver.findElement(By.id("br.com.libertyseguros.mobile.corretor:id/btnLogin")).click();
		Assert.assertEquals("O triângulo é Equilátero", driver.findElement(By.id("com.eliasnogueira.trianguloapp:id/txtResultado")).getText());*/
		
		
		System.out.println("Terminou a execução com sucesso !");
		
	}
	
	
	
}
