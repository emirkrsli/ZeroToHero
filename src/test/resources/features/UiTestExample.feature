
  Feature:


    Scenario Outline: Positive Login Test

      Given Open page https://practicetestautomation.com/practice-test-login/
      And   Type "<username>" student into Username field
      When  Type "<password>" Password123 into Password field
      And   Puch Submit button.
      Then  Verify new page contains expected text ('Congratulations' or 'successfully logged in')
      Then  Verify button Log out is displayed on the new page.
      Examples:
        | username | password |
        | student  | Password123|