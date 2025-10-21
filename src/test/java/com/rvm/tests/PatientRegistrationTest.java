package com.rvm.tests;


import org.testng.annotations.Test;
import com.project.base.SetUp;
import com.rvm.pages.PatientRegistrationPage;

public class PatientRegistrationTest extends SetUp {
	
	PatientRegistrationPage pr;
	
	//Child constructor
    public PatientRegistrationTest() throws InterruptedException {
        // constructor chaining --> runs SetUp() constructor + initialization()
    	    // super(); -->Java automatically calls the parent constructor(SetUp) first, before running the child’s constructor.
        initialization();      // then call this method
    }

    @Test
    public void validatePropertyDetails() throws InterruptedException {
        pr = new PatientRegistrationPage(driver);
        pr.enterEmail("rvm@gmail.com");
        pr.enterPass("Admin@123");
        pr.signBtn();
        pr.patRegMenu();
        pr.newRegBtn();
        pr.walkInBtn();
        pr.firstName("Sujeetham");
        pr.lastName("Reddy");
        pr.dateOfBirth("26-10-1990");             
        pr.nationality("america");
        pr.bloodGroup("O+");
        pr.aadharNumber("546789258249");
        pr.selectReligion("Hinduism");
        pr.guardianName("PrasadRao");
        pr.guardianRelation("FATHER");
        pr.clickNextButton();
        pr.mobileNumber("7858454566");
        pr.enterArea("Ameerpet");
        pr.friendlyAddress("ATC");
        pr.clickSubmitBtn();
        pr.skipVerification();
        pr.speciality();
        pr.unitTeam();
        pr.selectDoctor();
        pr.selectDiscount("20.00");
        pr.selectVisitType("General Consultation");
        pr.reqNurseTriage();
        pr.selectPaymentMethod();
        pr.clickOPSubmitButton();
        
    }
    
    
	
}
