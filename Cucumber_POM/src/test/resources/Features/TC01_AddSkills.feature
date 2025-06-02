 
Feature: I am automating orangeHRM Application 


Background: common steps

Given User launch Chrome browser
When User enter URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 

Scenario: TC01 Addskill record- i am creating addskills record
And user enters username as "Admin" and password as "admin123"
Then Go to skill page 
When Add skills with skillname as "Java12344456" and skilldiscription as "Java12344456 desc"
When click on logout button
Then close the browser











      
      
      
      
      
      
      
      
      
      
      
