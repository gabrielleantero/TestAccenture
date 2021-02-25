package br.com.accenture.pagesobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectPriceOptionPage {
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/*//th[2]/label[1]/span")
	public WebElement OPTION_SILVER;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/*//th[2]/label[2]/span")
	public WebElement OPTION_GOLD;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/*//th[2]/label[3]/span")
	public WebElement OPTION_PLATINUM;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/*//th[2]/label[4]/span")
	public WebElement OPTION_ULTIMATE;
	
	@FindBy(id = "nextsendquote")
	public WebElement BTN_NEXT;


}
