# Selenium Cucumber BDD

Tools Used: Maven, Java, Selenium, Cucumber, Gherkin, JUnit

# Setting up and running tests

* Open project as Maven Project in Eclipse, Intellij, or other IDE 
* In this repository, the chrome driver for Google Chrome version 97 is already available. 
	* In case your Google Chrome version is different, you can download chrome driver from [this url](https://chromedriver.chromium.org/downloads) according to your version. Place chrome driver in the following folder of directory
```
{YourProjectPath}src/test/resources/drivers/chromedriver.exe
```
* In this repository, there is a FlipTest.feature file that consists of four scenarios:
	* Scenario 1: Check visibility and click on Bantuan button
	* Scenario 2: Check visibility and click on Karir button
	* Scenario 3: Check visibility and click on Biaya button
	* Scenario 4: Check visibility and click on Masuk button
* You can run this testing by running TestRunner file using JUnit, the directory of TestRunner is:
```
{YourProjectPath}src/test/java/TestRunner
```