package br.com.accenture.pagesobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendQuotePage {
	
	@FindBy(id = "email")
	public WebElement EMAIL;
	
	@FindBy(id = "phone")
	public WebElement PHONE;
	
	@FindBy(id = "username")
	public WebElement USERNAME;
	
	@FindBy(id = "password")
	public WebElement PASSWORD;
	
	@FindBy(id = "confirmpassword")
	public WebElement CONFIRM_PASSWORD;
	
	@FindBy(id = "Comments")
	public WebElement COMMENTS;
	
	@FindBy(id = "sendemail")
	public WebElement BTN_SEND;
	
	@FindBy(css = "div.sweet-alert.showSweetAlert.visible > h2")
	public WebElement MSG_SUCESSO;
	

}
