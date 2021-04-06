@LoginProfile
Feature: Login Profile
  As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  Background: User navigates to Company home page
    Given I am on the "Company home" page on URL "https://www.burning-glass.com/uk"
    Then I should see "Burning Glass Technologies" message

  Scenario: Navigate to Solutions page
    When I navigate to "Solutions" page from top menu bar
    Then I should have landed in "Solutions" page
    And below sections would be listed in "Solutions" page
      | Corporations             |
      | Education                |
      | Government and Workforce |
      | Recruiting and Staffing  |
      | Strategic Partnerships   |

  Scenario: Verify Navigate to About page
    When I navigate to "About" page from top menu bar
    Then I should have landed in "About" page
    And below sections would be listed in "About" page
      | Schedule a Demo        |
      | Find Your Solution     |
      | Have questions for us? |





#  Scenario Outline: Failed login using wrong credentials
#    When I fill in "Username" with "<username>"
#    And I fill in "Password" with "<password>"
#    And I click on the "Login" button
#    And I should see "<warning>" message
#    Examples:
#      | username    | password   | warning                           |
#      | Test        | !23        | Incorrect credentials. Try again! |
#      | Tset        | 123        | Incorrect credentials. Try again! |
#      | Tset        | !23        | Incorrect credentials. Try again! |
#      | Test        |            | Please enter password.            |
#      |             | 123        | Please enter username.            |
#      |             |            | Please enter your credentials.    |