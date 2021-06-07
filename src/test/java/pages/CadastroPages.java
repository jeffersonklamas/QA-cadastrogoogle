package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {

	static WebDriver driver;

	public CadastroPages(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherCampos() {
		// Indicando o elemento id para buscar pagina selecionada
		WebElement nome = driver.findElement(By.id("firstName"));
		nome.sendKeys("Only");
		// Indicando o elemento name para buscar na página
		WebElement sobrenome = driver.findElement(By.name("lastName"));
		sobrenome.sendKeys("testing");
		
		WebElement email = driver.findElement(By.name("Username"));
		email.sendKeys("testingonlyddr");
		
		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("testingonly736@_**");
		
		WebElement confirmasenha = driver.findElement(By.name("ConfirmPasswd"));
		confirmasenha.sendKeys("testingonly736@_**");
		
		// Irá clicar em próxima tela
		WebElement proximatela = driver.findElement(By.xpath("//span[contains(text(),'Próxima')]"));
		proximatela.click();
				
	}
}
