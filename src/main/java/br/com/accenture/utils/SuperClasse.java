package br.com.accenture.utils;

import static org.testng.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperClasse {

	private static final long TIME_OUT_BUSCA_ELEMENTO_SEGUNDOS = 30L;
	private static final long INTERVALO_BUSCA_ELEMENTO_MILLIS = 500L;
	private final WebDriver DRIVER = DriverManager.initDriver();
	private final WebDriverWait WAIT = new WebDriverWait(DRIVER, TIME_OUT_BUSCA_ELEMENTO_SEGUNDOS,
			INTERVALO_BUSCA_ELEMENTO_MILLIS);
	public static String diretorioUpload = "\\src\\main\\resources\\picture\\";

	/*
	 * Construtor que inicializa os objetos que estao class PageObject
	 * 
	 */
	protected <T> T initElements(Class<T> pageClass) {
		return PageFactory.initElements(DRIVER, pageClass);
	}

	private String getLocatorElement(WebElement element) {
		return element.toString().replaceAll("\\S+: \\S+ on \\S+ (\\S+) -> ", "[");
	}

	public void aguardaElemento(WebElement object) {
		try {
			Log.info("Aguardando elemento: "
					+ getLocatorElement(WAIT.until(ExpectedConditions.elementToBeClickable(object))));
		} catch (NoSuchElementException e) {
			Log.info("ERRO - Elemento não encontrado: " + getLocatorElement(object));
			e.printStackTrace();
		} catch (Exception e) {
			Log.info("ERRO - Falha ao tentar localizar o elemento: " + getLocatorElement(object));
			e.printStackTrace();
		}
	}

	public void limpaCampo(WebElement object) {
		try {
			Log.info("Limpando campo: "
					+ getLocatorElement(WAIT.until(ExpectedConditions.elementToBeClickable(object))));
			object.clear();
		} catch (NoSuchElementException e) {
			Log.error("ERRO - Elemento não encontrato: " + getLocatorElement(object));
			e.printStackTrace();
		} catch (Exception e) {
			Log.error("ERRO - Erro ao limpar o campo: " + getLocatorElement(object));
			e.printStackTrace();
		}
	}

	public void preencheCampo(WebElement object, String texto) {
		limpaCampo(object);
		try {
			Log.info("Preenchendo campo: "
					+ getLocatorElement(WAIT.until(ExpectedConditions.elementToBeClickable(object))));
			object.sendKeys(texto);
			object.sendKeys(Keys.TAB);
		} catch (InvalidElementStateException e) {
			Log.error("ERRO - Elemento não esta habilitado no HTML: " + getLocatorElement(object));
			e.printStackTrace();
		} catch (StaleElementReferenceException e) {
			Log.error("ERRO - Elemento não encontrado no HTML: " + getLocatorElement(object));
			e.printStackTrace();
		} catch (Exception e) {
			Log.error("ERRO - Falha ao localizar o elemento: " + getLocatorElement(object));
			e.printStackTrace();
		}
	}

	public void clique(WebElement object) {
		aguardaElemento(object);
		try {
			Log.info("Clicando no objeto: "
					+ getLocatorElement(WAIT.until(ExpectedConditions.elementToBeClickable(object))));
			object.click();
		} catch (NoSuchElementException e) {
			Log.error("ERRO - Elemento não encontrado no HTML: " + getLocatorElement(object));
			e.printStackTrace();
		}
	}

	public void pontoVerificacao(boolean validacao, String check) {
		assertTrue(validacao, check);
	}

	public void pontoVerificacao(WebElement object, String atributo, String valorCheck) {
		aguardaElemento(object);
		try {
			pontoVerificacao(object.getAttribute(atributo).contains(valorCheck),
					"Validação do campo: " + getLocatorElement(object) + " Valor atual: "
							+ object.getAttribute(atributo) + " Valor esperado: " + valorCheck);
		} catch (NoSuchElementException fail) {
			pontoVerificacao(false, "Objeto n�o localizado - " + getLocatorElement(object));
			fail.printStackTrace();
		} catch (NullPointerException e) {
			pontoVerificacao(false,
					"Falha ao localizar Atributo: '" + atributo + "' no objeto - " + getLocatorElement(object));
			e.printStackTrace();
		} catch (Exception e) {
			pontoVerificacao(false, "Erro ao tentar localizar objeto - " + getLocatorElement(object));
			e.printStackTrace();
		} catch (Throwable T) {
			Log.error("Erro ao tentar comparar os textos. Valor atual: " + object.getAttribute(atributo)
					+ " Valor esperado: " + valorCheck);
			T.printStackTrace();
		}

	}

	protected void selecionaComboBox(WebElement object, String value) {
		try {
			Log.info("Selecionando comboBox por Value: " + value + " Objeto: "
					+ getLocatorElement(WAIT.until(ExpectedConditions.elementToBeClickable(object))));
			new Select(object).selectByVisibleText(value);
			Thread.sleep(300);
		} catch (Exception e) {
			Log.error("ERRO - Elemento não encontrado: " + getLocatorElement(object));
			e.printStackTrace();

		}
	}

	public void uploadArquivo(WebElement botaoUpload, String arquivo) {
		try {
			Log.info("Realizando upload de arquivo no campo: "
					+ getLocatorElement(botaoUpload));
			botaoUpload.sendKeys(System.getProperty("user.dir") + diretorioUpload + arquivo);
		} catch (Exception e) {
			Log.error("ERRO - Elemento nao encontrado no HTML: " + getLocatorElement(botaoUpload));
		}
	}


}
