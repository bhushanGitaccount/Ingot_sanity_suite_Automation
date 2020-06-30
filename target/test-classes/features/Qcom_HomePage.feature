Feature: Test all home page links are redirecting properly or not
  Background: User should be on home page
    Given user enter Qcom URl
    Given user enter username
    Given user enter password
    And click on qcom login button

    Scenario: User click on learn tab user should able to see product courses tab
      Given user should click on learn tab
      Then user able to see product courses

    Scenario: User click on learn tab user should able to see Certifications tab
      Given user should click on learn tab
      Then user able to see certification tab


