   
Feature: I am automating orangeHRM Application 


Background: common steps

Given User launch Chrome browser
When User enter URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 

Scenario Outline: TC01 Addskill record- i am creating addskills record
And user login into the below credentials
      |USERNAME|PASSWORD|
      |Admin|admin123|  
      
      
Then go to skills page  
      
When Creating skills record

     |SKILLNAME|SKILLDESCRIPTION|
     |Sales804|Sales804 descr|
     |Sales805|Sales805 descr|  
     |Sales806|Sales806 descr|
     
When click on logout button
Then close the browser

      
      
      
      
      
      
      
      
      
      
      
