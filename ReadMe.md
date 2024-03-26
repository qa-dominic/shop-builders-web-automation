## Automation Framework 
The KPX Automation Framework is designed to automate various transactional functions of KPX, such as Domestic SendOut, International SendOut, Wallet Services, and Partner Services. This framework utilizes Java, Selenium, Maven, Test NG, Extent Reporter, and Sl4j Logger to provide a robust and efficient automation solution.

### Prerequisites 
Before using the KPX Automation Framework, make sure you have the following dependencies installed:

#### *Java
#### *Selenium
#### *Maven
#### *Test NG
#### *Extent Reporter
#### *Sl4j Logger


### Creating Test Scripts
To create a test script, follow these steps:

1. Obtain the necessary locators, such as CSS selectors, and place them in the src/main/java/org.mlkpx.pageObject package. Here's an example of how to create a locator:

        public WebElement googleContainer2() {
        return getDriver().findElement(By.cssSelector("[class='haAclf']"));
        }
2. After creating the class for locators, proceed to create the test steps. This is where you define the steps required to complete a test case.
3. Once the test steps are created, create a BaseTest class. In this class, call the test steps so that they can be used across multiple test classes.
4. Finally, create your test classes and extend them from the BaseTest class. This will allow you to utilize the predefined test steps in your test cases.

### Test Execution
#### To execute your test scripts, run the Maven command mvn test in your project directory. This will trigger the Test NG framework to execute all the test cases defined in your project.

