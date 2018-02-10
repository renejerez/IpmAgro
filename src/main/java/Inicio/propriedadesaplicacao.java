package Inicio;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class propriedadesaplicacao {

	@Test
	public void cenario01() throws Exception {
		
		/*=====================================================*/
		/*=1ª=Parte=do=código=para=identificação=do=Capability=*/
		/*=====================================================*/
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
		
		/*=============================================================*/
		/*=2ª=Parte=do=código=para=preencher=os=campos=de=Equipamentos=*/
		/*=============================================================*/
		/*Aguardar a tela carregar para clicar*/
		Thread.sleep(20000);
				
		/*Clicar no botão iniciar do IPMAgro*/
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds = '[213,858][327,960]']")).click();
		Thread.sleep(5000);

		
//  	    /*Identificar a quantidade de valores no ListView de Categoria*/
//		
//		/*Preencher o campo de Categoria*/
//		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,169][516,237]']")).click();
//		Thread.sleep(5000);
//		 
//		 List <WebElement> categoria = driver.findElementsByXPath("//android.widget.ListView[@resource-id='android:id/select_dialog_listview']/android.widget.TextView");
//		 		 
//		 int size = categoria.size();		 
//			 for (int i  = 0; i < size; i++) {
//	
//	        	 String tipocategoria = categoria.get(i).getText();
//	        	 System.out.println(i + "-" + tipocategoria);
//			 }
		 

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
		
		//Rolar a tela 3 vezes//
		for (int rolartela = 0; rolartela < 3; rolartela++) 
		{
			 //Se for a primeira vez da tela não rolar a tela//
			 if (rolartela> 0)
			 {
			    /*Rolar a tela para baixo*/
				Dimension dimensao = driver.manage().window().getSize();
				
				double endyinicial = (0.06 * rolartela);
				
				//Esquerda superior, lugar inicial da tela
				int starty = (int) (dimensao.height * 0.80); 
								
				//espaço que será percorrido
				int endy = (int) (dimensao.height * endyinicial);
						
				//meio da tela
				int startx = dimensao.width / 2; 
				
				for (int rolartotal = 1; rolartotal <= rolartela ;rolartotal++)
				{
				driver.swipe(startx, starty, startx, endy, 3000);
				Thread.sleep(5000);
				}
			 }

			 //Listar os valores exibidos//
			 List <WebElement> uf = driver.findElementsByXPath("//android.widget.ListView[@resource-id='android:id/select_dialog_listview']/android.widget.TextView");
			 ArrayList<String> uftela = new ArrayList();				 
			 int size = uf.size();		 
				 for (int i  = 0; i < size; i++) 
				 	 { 
						 String tipouf = uf.get(i).getText();
						 uftela.add(tipouf);					 
				 	 }
				 
				 //Seleciona a UF da lista que aparece na tela
				 List<String> uftotal = new ArrayList<String>(new HashSet<String>(uftela));	
				 for (int selecionar  = 0; selecionar < uftotal.size(); selecionar++) 
					 { 
						 driver.findElement(By.xpath("//android.widget.TextView[@text = '"+ uftotal.get(selecionar) +"']")).click();
						 Thread.sleep(5000);
						 driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,601][516,669]']")).click();
						 Thread.sleep(10000);
						 System.out.println(selecionar+"-"+uftotal.get(selecionar));
						 
						 //Se for a primeira vez da tela não rolar a tela//
						 if (rolartela> 0)
						 {
						    /*Rolar a tela para baixo*/
							Dimension dimensao = driver.manage().window().getSize();
							
							//Esquerda superior, lugar inicial da tela
							int starty = (int) (dimensao.height * 0.80); 
											
							//espaço que será percorrido
							int endy = (int) (dimensao.height * 0.06);
									
							//meio da tela
							int startx = dimensao.width / 2; 
							
							//Comando Swipe, rolar a tela de cima para baixo
							for (int rolartotal = 1; rolartotal <= rolartela ;rolartotal++)
								{
								driver.swipe(startx, starty, startx, endy, 3000);
								Thread.sleep(5000);
								}
						 }
						 
						 
						 
					 }
		}
		
		
//		/*Clicar no botão iniciar de buscar*/
//		driver.findElement(By.xpath("//android.widget.Button[@bounds = '[24,684][516,756]']")).click();
//		Thread.sleep(10000);
//		
//		
//		/*Guardar o valor do equipamento*/
//		String ValorEquipamento; 
//		ValorEquipamento = driver.findElement(By.xpath("//android.widget.TextView[@bounds = '[18,677][266,721]']")).getText();
//		System.out.println(ValorEquipamento);
//		
//		
//		/*Clicar no botão voltar, para escolher outro equipamento*/
//		driver.findElement(By.xpath("//android.widget.Button[@bounds = '[0,36][69,120]']")).click();
//		Thread.sleep(10000);
//		
	
	System.out.println("Codigo Finalizado");
		
	}
	
	
}
