Feature: QcomLoginPage
  Scenario: Check user is able to redirect on home page
    Given user enter Qcom URl
    Given user enter username
    Given user enter password
    And click on qcom login button
    And home page tite should be "Qualcomm Discover Zone"

