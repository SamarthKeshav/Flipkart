package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

@FindBy(id="username")
private WebElement usernametbx;

@FindBy(name="pwd")
private WebElement passwordtbx;


@FindBy(id="loginButton")
private WebElement loginbtn;



LoginPage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}


public void setLogin(String un,String pwd) 

{
	usernametbx.sendKeys(un);
	passwordtbx.sendKeys(pwd);
	loginbtn.click();
}



}
