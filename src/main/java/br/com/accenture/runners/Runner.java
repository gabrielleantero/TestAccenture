package br.com.accenture.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = "src/main/resources/features", 
		glue = "",
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false,
		plugin = {"json:target/cucumber.json"})
public class Runner extends AbstractTestNGCucumberTests{
	
//	 	@After
//	 	public void fechar() {
////	 		DriverFactory.quitDriver();
//	 	}
//	 	
//	 	@AfterSuite
//		private static void encerraProcessos() {
//			// LOG.info("Tentando encerrar processos de drivers.");
//			try {
//				Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
//				Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
//				Thread.sleep(3000);
//				// LOG.info("Comando executado para encerrar os processos de drivers.");
//			} catch (Exception e) {
//			}
//		}
		
	 	
}
