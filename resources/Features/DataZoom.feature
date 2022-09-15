Feature: Validate the DataZoom Web Application

  Background: 
    Given User open the chrome browser
    When User launch the datazoom application

  
  Scenario Outline: TC01_Verify the successful login with valid credentials
    Given User open the chrome browser
    When User launch the datazoom application
    Then User verify the datazoom page
    When User Enter Valid "<username>" and "<password>"
    And User Click Login Button

    Examples: 
      | username                | password    |
      | sandhu+user@datazoom.io | qwerty@2022 |

  Scenario Outline: TC02_Verify that the app redirect to "Dashboard" page on successful login
    When User Enter Valid "<username>" and "<password>"
    And User Click Login Button
    And User click DataPipes
    When User Redirect DashBoard page
    Then User verify The DashBoard page

    Examples: 
      | username                | password    |
      | sandhu+user@datazoom.io | qwerty@2022 |

  Scenario Outline: TC03_Verify unsuccessful login shown an error message "Incorrect username or password.Please try again or reset your password."in the UI
    When User Enter Invalid "<Username>" and "<Password>"
    And User Click Login Button
    Then User verify the error message

    Examples: 
      | Username      | Password |
      | hierarchy4887 | hyer@123 |
