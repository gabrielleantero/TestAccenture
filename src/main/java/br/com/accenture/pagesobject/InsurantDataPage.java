package br.com.accenture.pagesobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsurantDataPage {
	
	@FindBy(id = "firstname")
	public WebElement FIRST_NAME;
	
	@FindBy(id = "lastname")
	public WebElement LAST_NAME;
	
	@FindBy(id = "birthdate")
	public WebElement DATE_OF_BIRTH;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[4]//label[1]/span")
	public WebElement GENDER_MALE;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[4]//label[2]/span")
	public WebElement GENDER_FEMALE;
	
	@FindBy(id = "streetaddress")
	public WebElement STREET_ADDRESS;
	
	@FindBy(id = "country")
	public WebElement COUNTRY;
	
	@FindBy(id = "zipcode")
	public WebElement ZIP_CODE;
	
	@FindBy(id = "city")
	public WebElement CITY;
	
	@FindBy(id = "occupation")
	public WebElement OCCUPATION;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[10]//label[1]/span")
	public WebElement HOBBIE_SPEEDING;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[10]//label[2]/span")
	public WebElement HOBBIE_BUNGEEJUMPING;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[10]//label[3]/span")
	public WebElement HOBBIE_CLIFFDIVING;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[10]//label[4]/span")
	public WebElement HOBBIE_SKYDIVING;
	
	@FindBy(xpath = "//*[@id='insurance-form']//div[10]//label[5]/span")
	public WebElement HOBBIE_OTHER;
	
	@FindBy(id = "website")
	public WebElement WEBSITE;
	
	@FindBy(xpath = "//input[@type='file']")
	public WebElement PICTURE;
	
	@FindBy(id = "nextenterproductdata")
	public WebElement BTN_NEXT;
	
}
