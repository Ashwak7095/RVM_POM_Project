package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project.base.SetUp;
import com.rvm.pages.PatientRegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientRegistrationSteps extends SetUp{
	
	//WebDriver driver;     //If we want to use driver directly throughout this class,add a class-level variable
	//SetUp setup;
    PatientRegistrationPage pr;

    @Given("the user launches the Chrome browser and navigates to the application URL")
    public void the_user_launches_the_chrome_browser() throws InterruptedException {
        //Create SetUp class instance(object) so constructor automatically calls/loads properties
        //setup = new SetUp();
        
        //Initialize browser OR launches the browser
        initialization();
        
        //driver = setup.getDriver();
        
        //We must create the page object after the driver is initialized.(driver exists) otherwise we will get NullPointerException 
        //Now create the page object using the driver from setup
        pr = new PatientRegistrationPage(getDriver());
    }

    @When("the user enters email as {string}")
    public void the_user_enters_email_as(String email) {  	
    		pr.enterEmail(email); 		
    }

    @When("the user enters password as {string}")
    public void the_user_enters_password_as(String password) {
    		pr.enterPass(password);
    }

    @When("the user clicks on the Sign In button")
    public void the_user_clicks_on_the_sign_in_button() throws InterruptedException {
    		pr.signBtn();
        Thread.sleep(1000);
    }

    @When("the user clicks on the Patient Registration menu in the side navigation bar")
    public void the_user_clicks_on_the_patient_registration_menu_in_the_side_navigation_bar() throws InterruptedException {
    		pr.patRegMenu();
    }

    @When("the user clicks on the New Registration card")
    public void the_user_clicks_on_the_new_registration_card() throws InterruptedException {
    		pr.newRegBtn();     
    }

    @When("the user clicks on the Walk-in button in the admission type popup")
    public void the_user_clicks_on_the_walk_in_button_in_the_admission_type_popup() throws InterruptedException {
    		pr.walkInBtn();
    }

    @When("the user enters First Name as {string}")
    public void the_user_enters_first_name_as(String firstName) {
    		pr.firstName(firstName);
    }

    @When("the user enters Last Name as {string}")
    public void the_user_enters_last_name_as(String lastName) {        
    		pr.lastName(lastName);
    }

    @When("the user enters Date of Birth as {string}")
    public void the_user_enters_date_of_birth_as(String dob) throws InterruptedException {      
    		pr.dateOfBirth(dob);
        Thread.sleep(1000);
    }
    
    @When("the user selects Blood Group as {string}")
    public void selectsBloodGroup(String bloodgroup) {     
    		pr.bloodGroup(bloodgroup);
    }

    @When("the user selects Nationality as {string}")
    public void the_user_selects_nationality_as(String nationality) throws InterruptedException {     
    		pr.nationality(nationality);
    }
    
    @When("the user enters Aadhaar Card Number as {string}")
    public void entersAadharNumber(String aadhar) {
    		pr.aadharNumber(aadhar);
    }
    
    @When("the user selects Religion as {string}")
    public void selectsReligion(String religion) throws InterruptedException {
    		pr.selectReligion(religion);
    }
    
    @When("the user enters Guardian Name as {string}")
    public void selectsGuardianName(String guarname) {
    		pr.guardianName(guarname);
    }
    
    @When("the user entres Guardian Relation as {string}")
    public void selectsGuardianRelation(String guarrelation) {
    		pr.guardianRelation(guarrelation);
    }
    
    @When("the user clicks on the Next button")
    public void the_user_clicks_on_the_next_button() {
    		pr.clickNextButton();
    }
    
    @When("the user enters mobile number as {string}")
    public void the_user_enters_mobile_number_as(String mobile) {
    		pr.mobileNumber(mobile);   		
    }
	
    @When("the user enters area as {string}")
    public void the_user_enters_area_as(String area) throws InterruptedException {
    		pr.enterArea(area);
    }
    
	@When("the user enters Friendly Address as {string}")
    public void the_user_enters_friendly_address_as(String fraddress) {
		pr.friendlyAddress(fraddress);
    }
	
    @When("the user clicks on the Submit button")
    public void the_user_clicks_on_the_submit_button() throws InterruptedException {
    		pr.clickSubmitBtn();
    		Thread.sleep(1000);
    }
       
    @When("the user clicks on the SkipVerification link")
    public void skipVerification() throws InterruptedException {
    		pr.skipVerification();
    }
    
    @When("the user selects a Speciality")
    public void the_user_selects_speciality() throws InterruptedException {
    		pr.speciality();
    }

    @When("the user selects a Team Unit")
    public void the_user_selects_team_unit() throws InterruptedException {
    		pr.unitTeam();
    }

    @When("the user selects a Doctor")
    public void the_user_selects_doctor() throws InterruptedException {
    		pr.selectDoctor();
    }
    
    @When("the user selects a Discount {string}")
    public void discount(String disc) throws InterruptedException {    		
    		pr.selectDiscount(disc);  
    }
    
	@When("the user selects a VisitType {string}")
	public void visitType(String vType) throws InterruptedException {
		pr.selectVisitType(vType);
	}
	
	@When("the user selects the Required Nurse Triage checkbox")
	public void requiredNurseTriage() throws InterruptedException {
		pr.reqNurseTriage();
	}
	
	@When("the user selects the Payment Method as Cash radio button")
	public void paymentMethod() throws InterruptedException {
		pr.selectPaymentMethod();
	}
	
	@Then("the user clicks on the OP Submit button")
	public void submitBtn() throws InterruptedException {
		pr.clickOPSubmitButton();
	}
	

   
}
