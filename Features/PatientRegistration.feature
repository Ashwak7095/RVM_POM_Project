Feature: Patient Registration Form feature

  Scenario: Verify successful Walk-in patient registration with valid details
    Given the user launches the Chrome browser and navigates to the application URL
    And the user enters email as "rvm@gmail.com" 
    And the user enters password as "Admin@123"
    And the user clicks on the Sign In button
    And the user clicks on the Patient Registration menu in the side navigation bar
    And the user clicks on the New Registration card
    And the user clicks on the Walk-in button in the admission type popup
    And the user enters First Name as "Rampthuneni"
    And the user enters Last Name as "Tej"
    And the user enters Date of Birth as "11/03/1983"
    And the user selects Blood Group as "O+"
    And the user selects Nationality as "america"
    And the user enters Aadhaar Card Number as "666905814583"
    And the user selects Religion as "Hinduism"
    And the user enters Guardian Name as "RamPrasad"
    And the user entres Guardian Relation as "FATHER"   
    And the user clicks on the Next button
    And the user enters mobile number as "6388875447"
    And the user enters area as "Ameerpet"
    And the user enters Friendly Address as "ATC Block"
    And the user clicks on the Submit button    
    And the user clicks on the SkipVerification link
    And the user selects a Speciality
    And the user selects a Team Unit
    And the user selects a Doctor
    And the user selects a Discount "20.00"
    And the user selects a VisitType "General Consultation"
    And the user selects the Required Nurse Triage checkbox
    And the user selects the Payment Method as Cash radio button
    Then the user clicks on the OP Submit button
