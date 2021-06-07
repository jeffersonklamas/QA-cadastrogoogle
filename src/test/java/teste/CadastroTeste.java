package teste;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CadastroPages;

public class CadastroTeste {

	static WebDriver driver;
	static CadastroPages cadastroPages;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Informa onde esta o webdriver
		System.setProperty("webdriver.chrome.driver", "src/test/webdriver/chromedriver");
		// Adicionando o Chromer ao Driver
		driver = new ChromeDriver();
		// Informando a URL que será acessada
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
		// Instanciando cadastro Pages
		cadastroPages = new CadastroPages(driver);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

	@Test
	public void test() {
		cadastroPages.preencherCampos();

	}

}
