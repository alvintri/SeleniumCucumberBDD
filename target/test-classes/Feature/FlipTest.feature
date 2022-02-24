@All
Feature: Check and Click Button in Flip Webpage

	@Test1
	Scenario: Check and Click Bantuan Button
    Given User is on flip homepage
    When User verify bantuan button
    And User click bantuan button
    Then User is on bantuan page
  
  @Test2  
  Scenario: Check and Click Karir Button
    Given User is on flip homepage
    When User verify karir button
    And User click karir button
    Then User is on karir page
	
	@Test3    
  Scenario: Check and Click Biaya Button
    Given User is on flip homepage
    When User verify biaya button
    And User click biaya button
    Then User is on biaya page
	
	@Test4    
  Scenario: Check and Click Masuk Button
    Given User is on flip homepage
    When User verify masuk button
    And User click masuk button
    Then User is on masuk page