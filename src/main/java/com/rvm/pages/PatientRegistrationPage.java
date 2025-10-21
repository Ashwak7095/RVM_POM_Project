package com.rvm.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.base.SetUp;
import com.rvm.utils.Dropdowns;

public class PatientRegistrationPage extends SetUp {
	
	//WebDriver driver;  //Even though SetUp already has a driver, this page class declares its own local reference variable.
	
	// Constructor --> it runs automatically when you create an object like: PatientRegistrationPage class
    public PatientRegistrationPage(WebDriver driver) 
    {
    	    //this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    
    // ----------- WebElements & Actions -----------


    @FindBy(xpath = "//input[@id='email-username']")
    WebElement email;
    public void enterEmail(String val) {
        email.sendKeys(val);
    }
      
    @FindBy(xpath = "//input[@id='password-input']")
    WebElement pass;
    public void enterPass(String val) {
        pass.sendKeys(val);
    }
     
    @FindBy(xpath = "//button[text()='Sign In']")
    WebElement signin;
    public void signBtn() {
        signin.click();
    }
       
    @FindBy(xpath = "//span[text()='Patient Registration']")
    WebElement patReg;
    public void patRegMenu() throws InterruptedException {
    		patReg.click();
    		Thread.sleep(1000);
    }
      
    @FindBy(xpath = "//h4[text()='New Registration']")
    WebElement regbtn;
    public void newRegBtn() throws InterruptedException {
    		regbtn.click();
    		Thread.sleep(1000);
    }
          
	@FindBy(xpath = "(//a[normalize-space()='🚶 Walk-in'])[1]")
	WebElement walkin;
	public void walkInBtn() throws InterruptedException {
		walkin.click();
		Thread.sleep(1000);
	}
    
    @FindBy(xpath="//input[@id='admission_first_name']")
    WebElement fn;
    public void firstName(String val) {
    		fn.sendKeys(val);
    }
	
	@FindBy(xpath="//input[@id='admission_last_name']")
	WebElement ln;
	public void lastName(String val) {
		ln.sendKeys(val);
	}
	
	@FindBy(xpath="//input[@id='date_of_birth']")
	WebElement dob;
	public void dateOfBirth(String val) {
		dob.sendKeys(val);
	}
		   
	//DropDowns---> 
    @FindBy(xpath="//select[@id='admission_nationality']")
    WebElement nation;
    public void nationality(String val) {
    		Dropdowns.selectByText(nation, val);
    }
    
    @FindBy(xpath = "//select[@id='blood_group']")
    WebElement bg;
    public void bloodGroup(String val) {
        Dropdowns.selectByText(bg, val);
    }
    
    @FindBy(xpath="//input[@id='admission_aadhar_card_number']")
    WebElement ac;
    public void aadharNumber(String val) {
    		ac.sendKeys(val);
    }
    
	@FindBy(xpath = "//select[@id='admission_religion']")
	WebElement religion;
	public void selectReligion(String val) throws InterruptedException {
		Dropdowns.selectByText(religion, val);
		Thread.sleep(1000);
		
		//Scroll to 'Next' button 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement nextButton = driver.findElement(By.xpath("//button[normalize-space(.)='Next']")); 
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'end'});", nextButton); 
		Thread.sleep(1000);
	}
        
    @FindBy(xpath="//input[@id='admission_guardian_name']")
    WebElement gname;
    public void guardianName(String val) {
    		gname.sendKeys(val);  		
    }
       
    @FindBy(xpath = "//select[@id='admission_guardian_relation']")
    WebElement gd;
    public void guardianRelation(String val) {
        Dropdowns.selectByText(gd, val);
    }
    
    @FindBy(xpath="//button[normalize-space(.)='Next']")
    WebElement nextbtn;
    public void clickNextButton() {
    		nextbtn.click();
    }
    
    @FindBy(xpath="//input[@id='admission_mobile_number']")
    WebElement mobile;
    public void mobileNumber(String val) {
    		mobile.sendKeys(val);
    }
        
    @FindBy(xpath = "//input[@id='admission_current_area-ts-control']")
    WebElement areaInput;
    public void enterArea(String areaName) throws InterruptedException {
        // Click the text box and enter the area name
        areaInput.click();
        areaInput.sendKeys(areaName);
        Thread.sleep(1000);

        // Click on the matching dropDown option dynamically
        WebElement areaOption = driver.findElement(By.xpath("//span[text()='Ameerpet']"));
        areaOption.click();       
    }
    
    @FindBy(xpath="//textarea[@id='admission_current_friendly_address']")
    WebElement friendlyadd;
    public void friendlyAddress(String val) {
    		friendlyadd.sendKeys(val);   		
    }
    
    @FindBy(xpath="//button[normalize-space(.)='Submit']")
    WebElement submitbtn;
    public void clickSubmitBtn() {
    		submitbtn.click();
    }
    
    @FindBy(xpath="//a[text()='Skip Verification ?']")
    WebElement skiplink;
    public void skipVerification() throws InterruptedException {
    		skiplink.click();
    		Thread.sleep(3000);
    }
    
	@FindBy(xpath="//input[@id='tomselect-3-ts-control']")
	WebElement spec;
	public void speciality() throws InterruptedException {
		spec.click();
		Thread.sleep(1000);
		WebElement dropdownListbox = driver.findElement(By.xpath("//div[@id='tomselect-3-ts-dropdown']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop += 300;", dropdownListbox);
		Thread.sleep(1000);

		WebElement option = driver.findElement(By.xpath("//div[@id='tomselect-3-opt-13']"));
		option.click();
		Thread.sleep(1000);
	}
    
    @FindBy(xpath="//input[@id='tomselect-4-ts-control']")
    WebElement unit;
    public void unitTeam() throws InterruptedException {
    		unit.click();
    		
    		WebElement unOption = driver.findElement(By.xpath("//div[@id='tomselect-4-opt-3']"));
    		unOption.click();
    		Thread.sleep(1000);   		
    }
    
    @FindBy(xpath="//input[@id='tomselect-5-ts-control']")
    WebElement doctor ;
    public void selectDoctor() throws InterruptedException {
		doctor.click();

		WebElement doc = driver.findElement(By.xpath("//div[text()='25EMP0512286 - Dr - Tanveer Barad']"));
		doc.click();
		Thread.sleep(1000);
    }
    
    @FindBy(xpath="//select[@class='form-select doctor_discount_fee']")
    WebElement discount ;
    public void selectDiscount(String val) throws InterruptedException {
    		Dropdowns.selectByText(discount, val);
    }
    
    @FindBy(xpath="//select[@name='visit_type']")
    WebElement visitType ;
    public void selectVisitType (String val) throws InterruptedException {
    		Dropdowns.selectByText(visitType, val);
    }
    
    // Locate the NurseTriageCheckbox
    @FindBy(xpath="//input[@id='nurse-triage']")
    WebElement nurseTriage ;
    public void reqNurseTriage() throws InterruptedException {
    		
    		// Check and print initial selection status
    		boolean isSelected = nurseTriage.isSelected();
    		System.out.println("Initial state: " + isSelected);

    		// Verify and click only if not selected
    		if (isSelected) {
    		    System.out.println("Checkbox is already selected");
    		} else {			
    		    System.out.println("Checkbox is not selected — selecting it now");
    		    nurseTriage.click();
    		}
    		Thread.sleep(1000);   		  		
    }
    
    @FindBy(xpath="//input[@id='cash']")
    WebElement payment;
    public void selectPaymentMethod() throws InterruptedException {
		payment.click();
		Thread.sleep(1000);
    }
    
    @FindBy(xpath="//button[@name='create_out_patient']")
    WebElement opSubBtn;
    public void clickOPSubmitButton() throws InterruptedException {
    		opSubBtn.click();
		Thread.sleep(1000);
    }
    
   
}
