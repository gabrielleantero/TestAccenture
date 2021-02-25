package br.com.accenture.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static WebDriver driver;

	public static WebDriver initDriver() {
		if (driver == null) {
//			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");

		}
		return driver;

	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
		driver = null;
	}
	
	public static void encerraProcessos() {
    	Log.info("Tentando encerrar processos de drivers.");
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
            Thread.sleep(3000);
            Log.info("Comando executado para encerrar os processos de drivers.");
        } catch (Exception e) {
        }
    }
	
}
