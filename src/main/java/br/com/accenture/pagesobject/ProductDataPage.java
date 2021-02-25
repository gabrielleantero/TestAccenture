package br.com.accenture.pagesobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDataPage {
	
	@FindBy(id = "startdate")
	public WebElement START_DATE;
	
	@FindBy(id = "insurancesum")
	public WebElement COMBO_INSURANCE_SUM;
	
	@FindBy(id = "meritrating")
	public WebElement COMBO_MERIT_RATING;
	
	@FindBy(id = "damageinsurance")
	public WebElement COMBO_DAMAGE_INSURANCE;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[5]//label[1]/span")
	public WebElement PRODUCT_EURO_PROTECTION;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[5]//label[2]/span")
	public WebElement PRODUCT_LEGAL_DEFENSE;
	
	@FindBy(id = "courtesycar")
	public WebElement COMBO_COURTESY_CAR;
	
	@FindBy(id = "nextselectpriceoption")
	public WebElement BTN_NEXT;

}
