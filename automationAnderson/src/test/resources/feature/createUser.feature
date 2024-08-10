#author: Anderson Salamanca

Feature: Create User
  Everybody needs to create a new user

  @test
  Scenario: create a new user
    Given that the "user" should enter the shopping cart
    When go to the web page and create your user
    Then It will validate that it was created correctly by the creation alert