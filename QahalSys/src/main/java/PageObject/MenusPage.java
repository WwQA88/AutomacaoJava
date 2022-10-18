package PageObject;

import static Core.DriverFactory.*;

import org.openqa.selenium.By;

import Core.BaseTest;

public class MenusPage extends BaseTest {
	
	public void menuInicio() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_000")).click();
		
	}
	
	public void menuClientes() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_1")).click();
	}
	
	public void menuRelatorios() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_5")).click();
	}
	
	public void menuUsuarios() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_7")).click();
	}
	
	public void menuFuncionarios() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_3")).click();
	}
	
	public void menuDepartamentos() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_2")).click();
	}
	
	public void menuTestes() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_16")).click();
	}
	
	public void menuSistemas() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_6")).click();
	}
	
	public void menuIgreja() throws InterruptedException {
		
		Thread.sleep(1000);
		
		getDriver().findElement(By.id("item_mod_17")).click();
	}

}
