package br.com.accenture.pagesobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleDataPage {
	
	@FindBy(id = "selectedinsurance")
	public WebElement LABEL_AUTOMOBILE_INSURANCE;
	
	@FindBy(id = "nav_automobile")
	public WebElement LINK_AUTOMOBILE;
	
	@FindBy(id = "make")
	public WebElement COMBO_MAKE;
		
	@FindBy(id = "engineperformance")
	public WebElement ENGINE_PERFORMANCE;
	
	@FindBy(id = "dateofmanufacture")
	public WebElement DATE_OF_MANUFACTURE;
	
	@FindBy(id = "numberofseats")
	public WebElement COMBO_NUMBER_SEATS;
	
	@FindBy(id = "fuel")
	public WebElement COMBO_FUEL_TYPE;
	
	@FindBy(id = "listprice")
	public WebElement LIST_PRICE;
	
	@FindBy(id = "licenseplatenumber")
	public WebElement LICENSE_PLATE_NUMBER;
	
	@FindBy(id = "annualmileage")
	public WebElement ANNUAL_MILEAGE;
	
	@FindBy(id = "nextenterinsurantdata")
	public WebElement BTN_NEXT;
	
}
