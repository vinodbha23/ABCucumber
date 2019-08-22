Feature: Reset functionality on POLICY page of Application


@smoke
Scenario: Verification of Reset button 
Given Open the Browser and launch the application and enter details1 
| id  | 100 | 
| firstName  | Anna |
|lastName| Hajere |
When Enter the Username and Password			
Then Reset the credential
And Logout the application 




@smoke
Scenario: Verification of Reset button 
Given Open the Browser and launch the application and enter details2 
| id  | firstName | lastName | dateOfBirth | 
| 100 | Rachel    | Green    | 1990-01-01  | 
| 101 | Sachin | Tendulkar | 1990-02-02  | 

When Enter the Username and Password
Then Reset the credential
And Logout the application

