Feature: Register Facebook

  Scenario Outline: Test Register facebook valid
    Given I want to register facabook using email
    When Iput First Name and Last Name
    And Input Your Email and Your Password
    And verify Email
    And Input birth date klik Register
    Then Account facebook success to Registed
