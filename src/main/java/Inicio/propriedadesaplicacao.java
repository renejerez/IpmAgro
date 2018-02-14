package Inicio;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class propriedadesaplicacao {

	@Test
	public void cenario01() throws Exception 
	{
		
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

		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////
	    ///////////////////////////////////////////////////////////////////////////////////////////////////////		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		//Preencher*Categoria//////////////////////////////////////////////////////////////////////////////////		
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,169][516,237]']")).click();
		Thread.sleep(5000);

		//**********************************************//
		//******Criar*as*listas*de*valores*da*tela******//
		//**********************************************//
		List <WebElement> categoria = driver.findElementsByXPath("//android.widget.ListView[@resource-id='android:id/select_dialog_listview']/android.widget.TextView");
		ArrayList<String> categoriatotal = new ArrayList();				 
	 
		//**********************************************//
		//Verificar*o*tamanho*da*lista*e*incluir*valores//
		//**********************************************//
		int categoriasize = categoria.size();		 
		for (int categoriai  = 0; categoriai < categoriasize; categoriai++) 
		{ 
			String categoriatipo = categoria.get(categoriai).getText();
			categoriatotal.add(categoriatipo);					 
		}
	 
		//**********************************************************//
		//Seleciona*um*valor*da*lista,*até*acabar*os*valores*da*tela//
		//**********************************************************//
		for (int categoriaselecionar  = 0; categoriaselecionar < categoriatotal.size(); categoriaselecionar++) 
		{ 
			 driver.findElement(By.xpath("//android.widget.TextView[@text = '"+ categoriatotal.get(categoriaselecionar) +"']")).click();
			 Thread.sleep(5000);
		
		
				
			///////////////////////////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////////////////////////////////
		    ///////////////////////////////////////////////////////////////////////////////////////////////////////		
			///////////////////////////////////////////////////////////////////////////////////////////////////////
			//Preencher*Marca//////////////////////////////////////////////////////////////////////////////////////		
			driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,277][516,345]']")).click();
			Thread.sleep(5000);
			
			 //**********************************************//
			 //******Criar*as*listas*de*valores*da*tela******//
			 //**********************************************//
			 List <WebElement> marca = driver.findElementsByXPath("//android.widget.ListView[@resource-id='android:id/select_dialog_listview']/android.widget.TextView");
			 ArrayList<String> marcatotal = new ArrayList();				 
			 
			 //**********************************************//
			 //Verificar*o*tamanho*da*lista*e*incluir*valores//
			 //**********************************************//
			 int marcasize = marca.size();		 
			 for (int marcai  = 0; marcai < marcasize; marcai++) 
			 { 
				 String marcatipo = marca.get(marcai).getText();
				 marcatotal.add(marcatipo);					 
			 }
			 
			 //**********************************************************//
			 //Seleciona*um*valor*da*lista,*até*acabar*os*valores*da*tela//
			 //**********************************************************//
			 for (int marcaselecionar  = 0; marcaselecionar < marcatotal.size(); marcaselecionar++) 
			 { 
				 driver.findElement(By.xpath("//android.widget.TextView[@text = '"+ marcatotal.get(marcaselecionar) +"']")).click();
				 Thread.sleep(5000);
	
				 
			
				///////////////////////////////////////////////////////////////////////////////////////////////////////
				///////////////////////////////////////////////////////////////////////////////////////////////////////
			    ///////////////////////////////////////////////////////////////////////////////////////////////////////		
				///////////////////////////////////////////////////////////////////////////////////////////////////////
				//Preencher*Modelo/////////////////////////////////////////////////////////////////////////////////////
				driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,385][516,453]']")).click();
				Thread.sleep(5000);
				
				
				//***************Rolar*a*tela*5*vezes**************//
				for (int modelorolartela = 0; modelorolartela < 6; modelorolartela++) 
				{
					 
					 //**********************************************//
					 //Se*for*a*primeira*vez*da*tela*não*rolar*a*tela//
					 //**********************************************//
					 if (modelorolartela> 0)
					 {
					    //Rolar a tela para baixo//
						Dimension modelodimensao = driver.manage().window().getSize();
							
						//Esquerda superior, lugar inicial da tela//
						int modelostarty = (int) (modelodimensao.height * 0.80); 
										
						//espaço que será percorrido//
						int modeloendy = (int) (modelodimensao.height * 0.06);
								
						//meio da tela//
						int modelostartx = modelodimensao.width / 2; 
						
						
						//**********************************************//
						//Rolar*a*tela*conforme*quantidade*de*repetições//
						//**********************************************//
						for (int modelorolartotal = 1; modelorolartotal <= modelorolartela ;modelorolartotal++)
						{
							driver.swipe(modelostartx, modelostarty, modelostartx, modeloendy, 3000);
							Thread.sleep(5000);
						}
					 }
		
					 //**********************************************//
					 //******Criar*as*listas*de*valores*da*tela******//
					 //**********************************************//
					 List <WebElement> modelo = driver.findElementsByXPath("//android.widget.ListView[@resource-id='android:id/select_dialog_listview']/android.widget.TextView");
					 ArrayList<String> modelototal = new ArrayList();				 
					 
					 //**********************************************//
					 //Verificar*o*tamanho*da*lista*e*incluir*valores//
					 //**********************************************//
					 int modelosize = modelo.size();		 
					 for (int modeloi  = 0; modeloi < modelosize; modeloi++) 
					 { 
						 String modelotipo = modelo.get(modeloi).getText();
						 modelototal.add(modelotipo);					 
					 }
					 
					 //**********************************************************//
					 //Seleciona*um*valor*da*lista,*até*acabar*os*valores*da*tela//
					 //**********************************************************//
					 for (int modeloselecionar  = 0; modeloselecionar < modelototal.size(); modeloselecionar++) 
					 { 
						 driver.findElement(By.xpath("//android.widget.TextView[@text = '"+ modelototal.get(modeloselecionar) +"']")).click();
						 Thread.sleep(5000);		
				
						 
				
					    ///////////////////////////////////////////////////////////////////////////////////////////////////////
					    ///////////////////////////////////////////////////////////////////////////////////////////////////////		
						///////////////////////////////////////////////////////////////////////////////////////////////////////
						//Preencher*Ano////////////////////////////////////////////////////////////////////////////////////////
						driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,493][516,561]']")).click();
						Thread.sleep(5000);
				
						
						//***************Rolar*a*tela*2*vezes**************//
						for (int anorolartela = 0; anorolartela < 2; anorolartela++) 
						{
							 
							 //**********************************************//
							 //Se*for*a*primeira*vez*da*tela*não*rolar*a*tela//
							 //**********************************************//
							 if (anorolartela> 0)
							 {
							    //Rolar a tela para baixo//
								Dimension anodimensao = driver.manage().window().getSize();
									
								//Esquerda superior, lugar inicial da tela//
								int anostarty = (int) (anodimensao.height * 0.80); 
												
								//espaço que será percorrido//
								int anoendy = (int) (anodimensao.height * 0.06);
										
								//meio da tela//
								int anostartx = anodimensao.width / 2; 
								
								
								//**********************************************//
								//Rolar*a*tela*conforme*quantidade*de*repetições//
								//**********************************************//
								for (int anorolartotal = 1; anorolartotal <= anorolartela ;anorolartotal++)
								{
									driver.swipe(anostartx, anostarty, anostartx, anoendy, 3000);
									Thread.sleep(5000);
								}
							 }
				
							 //**********************************************//
							 //******Criar*as*listas*de*valores*da*tela******//
							 //**********************************************//
							 List <WebElement> ano = driver.findElementsByXPath("//android.widget.ListView[@resource-id='android:id/select_dialog_listview']/android.widget.TextView");
							 ArrayList<String> anototal = new ArrayList();				 
							 
							 //**********************************************//
							 //Verificar*o*tamanho*da*lista*e*incluir*valores//
							 //**********************************************//
							 int anosize = ano.size();		 
							 for (int anoi  = 0; anoi < anosize; anoi++) 
							 { 
								 String anotipo = ano.get(anoi).getText();
								 anototal.add(anotipo);					 
							 }
							 
							 //**********************************************************//
							 //Seleciona*um*valor*da*lista,*até*acabar*os*valores*da*tela//
							 //**********************************************************//
							 for (int anoselecionar  = 0; anoselecionar < anototal.size(); anoselecionar++) 
							 { 
								 driver.findElement(By.xpath("//android.widget.TextView[@text = '"+ anototal.get(anoselecionar) +"']")).click();
								 Thread.sleep(5000);
							
		
								 
								 	///////////////////////////////////////////////////////////////////////////////////////////////////////
								    ///////////////////////////////////////////////////////////////////////////////////////////////////////
								    //Preencher*UF/////////////////////////////////////////////////////////////////////////////////////////
									driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,601][516,669]']")).click();
									Thread.sleep(5000);
									
									//***************Rolar*a*tela*3*vezes**************//
									for (int ufrolartela = 0; ufrolartela < 3; ufrolartela++) 
									{
										 
										 //**********************************************//
										 //Se*for*a*primeira*vez*da*tela*não*rolar*a*tela//
										 //**********************************************//
										 if (ufrolartela> 0)
										 {
										    //Rolar a tela para baixo//
											Dimension ufdimensao = driver.manage().window().getSize();
												
											//Esquerda superior, lugar inicial da tela//
											int ufstarty = (int) (ufdimensao.height * 0.80); 
															
											//espaço que será percorrido//
											int ufendy = (int) (ufdimensao.height * 0.06);
													
											//meio da tela//
											int ufstartx = ufdimensao.width / 2; 
											
											
											//**********************************************//
											//Rolar*a*tela*conforme*quantidade*de*repetições//
											//**********************************************//
											for (int ufrolartotal = 1; ufrolartotal <= ufrolartela ; ufrolartotal++)
											{
												driver.swipe(ufstartx, ufstarty, ufstartx, ufendy, 3000);
												Thread.sleep(5000);
											}
										 }
				
										 //**********************************************//
										 //******Criar*as*listas*de*valores*da*tela******//
										 //**********************************************//
										 List <WebElement> uf = driver.findElementsByXPath("//android.widget.ListView[@resource-id='android:id/select_dialog_listview']/android.widget.TextView");
										 ArrayList<String> uftotal = new ArrayList();				 
										 
										 //**********************************************//
										 //Verificar*o*tamanho*da*lista*e*incluir*valores//
										 //**********************************************//
										 int ufsize = uf.size();		 
										 for (int ufi  = 0; ufi < ufsize; ufi++) 
										 { 
											 String uftipo = uf.get(ufi).getText();
											 uftotal.add(uftipo);					 
										 }
										 
										 //**********************************************************//
										 //Seleciona*um*valor*da*lista,*até*acabar*os*valores*da*tela//
										 //**********************************************************//
										 for (int ufselecionar  = 0; ufselecionar < uftotal.size(); ufselecionar++) 
										 { 
											 driver.findElement(By.xpath("//android.widget.TextView[@text = '"+ uftotal.get(ufselecionar) +"']")).click();
											 Thread.sleep(5000);
				
											 //Clicar no botão iniciar de buscar//
											 driver.findElement(By.xpath("//android.widget.Button[@bounds = '[24,684][516,756]']")).click();
											 Thread.sleep(10000);
											
											 //Guardar o valor do equipamento//
											 String ValorEquipamento; 
											 ValorEquipamento = driver.findElement(By.xpath("//android.widget.TextView[@bounds = '[18,677][266,721]']")).getText();
											 System.out.println("Categoria: " + categoriatotal.get(categoriaselecionar) + "; Marca: " + marcatotal.get(marcaselecionar) + "; Modelo: " + modelototal.get(modeloselecionar) + "; Ano: " + anototal.get(anoselecionar) + "; UF: " + uftotal.get(ufselecionar)+"; ValorEquipamento: " + ValorEquipamento);
											 Thread.sleep(10000);
											
											 System.out.println(categoriatotal);
											 System.out.println(marcatotal);
											 System.out.println(modelototal);
											 System.out.println(anototal);
											 System.out.println(uftotal);
											 
											 //Clicar no botão voltar, para escolher outro equipamento//
											 driver.findElement(By.className("android.widget.ImageButton")).click();
											 Thread.sleep(10000);
											 
											 driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,601][516,669]']")).click();							 
				
											 //**********************************************//
											 //Se*for*a*primeira*vez*da*tela*não*rolar*a*tela//
											 //**********************************************//
											 if (ufrolartela> 0)
											 {
											    /*Rolar a tela para baixo*/
												Dimension ufdimensao = driver.manage().window().getSize();
												
												//Esquerda superior, lugar inicial da tela
												int ufstarty = (int) (ufdimensao.height * 0.80); 
																
												//espaço que será percorrido
												int ufendy = (int) (ufdimensao.height * 0.06);
														
												//meio da tela
												int ufstartx = ufdimensao.width / 2; 
												
												 //**********************************************//
												 //*******comando*swipe*para*rolar*a*tela********//
												 //**********************************************//
												for (int ufrolartotal = 1; ufrolartotal <= ufrolartela ;ufrolartotal++)
												{
													driver.swipe(ufstartx, ufstarty, ufstartx, ufendy, 3000);
													Thread.sleep(5000);
												}
											 } 
										  }
									  }				 
									
									driver.findElement(By.xpath("//android.widget.Button[@text= 'Cancelar']")).click();					 	
								    ///////////////////////////////////////////////////////////////////////////////////////////////////////					
								    ///////////////////////////////////////////////////////////////////////////////////////////////////////
									///////////////////////////////////////////////////////////////////////////////////////////////////////
				
									
									
								 driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,493][516,561]']")).click();
								 Thread.sleep(10000);				 
								 
								 //**********************************************//
								 //Se*for*a*primeira*vez*da*tela*não*rolar*a*tela//
								 //**********************************************//
								 if (anorolartela> 0)
								 {
								    /*Rolar a tela para baixo*/
									Dimension anodimensao = driver.manage().window().getSize();
									
									//Esquerda superior, lugar inicial da tela
									int anostarty = (int) (anodimensao.height * 0.80); 
													
									//espaço que será percorrido
									int anoendy = (int) (anodimensao.height * 0.06);
											
									//meio da tela
									int anostartx = anodimensao.width / 2; 
									
									 //**********************************************//
									 //*******comando*swipe*para*rolar*a*tela********//
									 //**********************************************//
									for (int anorolartotal = 1; anorolartotal <= anorolartela ;anorolartotal++)
									{
										driver.swipe(anostartx, anostarty, anostartx, anoendy, 3000);
										Thread.sleep(5000);
									}
								 } 
							  }	 
						  }
								
						//Botão Cancelar//
						driver.findElement(By.xpath("//android.widget.Button[@text= 'Cancelar']")).click();  
						System.out.println("Codigo Finalizado");
						///////////////////////////////////////////////////////////////////////////////////////////////////////
					    ///////////////////////////////////////////////////////////////////////////////////////////////////////		
						///////////////////////////////////////////////////////////////////////////////////////////////////////	
						///////////////////////////////////////////////////////////////////////////////////////////////////////	
				
		
						
					 driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,385][516,453]']")).click();
					 Thread.sleep(10000);				 
					 
					 //**********************************************//
					 //Se*for*a*primeira*vez*da*tela*não*rolar*a*tela//
					 //**********************************************//
					 if (modelorolartela> 0)
					 {
					    /*Rolar a tela para baixo*/
						Dimension modelodimensao = driver.manage().window().getSize();
						
						//Esquerda superior, lugar inicial da tela
						int modelostarty = (int) (modelodimensao.height * 0.80); 
										
						//espaço que será percorrido
						int modeloendy = (int) (modelodimensao.height * 0.06);
								
						//meio da tela
						int modelostartx = modelodimensao.width / 2; 
						
						 //**********************************************//
						 //*******comando*swipe*para*rolar*a*tela********//
						 //**********************************************//
						for (int modelorolartotal = 1; modelorolartotal <= modelorolartela ;modelorolartotal++)
						{
							driver.swipe(modelostartx, modelostarty, modelostartx, modeloendy, 3000);
							Thread.sleep(5000);
						}
					 } 
				  }	 
			  }
					
			//Botão Cancelar//
			driver.findElement(By.xpath("//android.widget.Button[@text= 'Cancelar']")).click();  
			System.out.println("Codigo Finalizado");	
			///////////////////////////////////////////////////////////////////////////////////////////////////////
		    ///////////////////////////////////////////////////////////////////////////////////////////////////////		
			///////////////////////////////////////////////////////////////////////////////////////////////////////	
			///////////////////////////////////////////////////////////////////////////////////////////////////////	
			///////////////////////////////////////////////////////////////////////////////////////////////////////	
				
		
	
		 driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,277][516,345]']")).click();
		 Thread.sleep(5000);
			 
		 }
		
		 //Botão Cancelar//
		 driver.findElement(By.xpath("//android.widget.Button[@text= 'Cancelar']")).click();  
		 System.out.println("Codigo Finalizado");	
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////		
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////	

	 driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,277][516,345]']")).click();
	 Thread.sleep(5000);
		 
	 }
	
	 //Botão Cancelar//
	 driver.findElement(By.xpath("//android.widget.Button[@text= 'Cancelar']")).click();  
	 System.out.println("Codigo Finalizado");	
		 		
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////		
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////		

		 
		 
		
		}

	
}
